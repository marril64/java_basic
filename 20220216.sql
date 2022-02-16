-- 조건부로 데이터 입력하기
-- 예를 들어 100개의 데이터를 입력하려고 하는데 첫 번재 자료만
-- 기본 데이터의 id와 중복되는 값이 있고, 이후 99건은 PK가 중복되지 않는다고 해도
-- SQL 시스템 상 전체 데이터가 입력되지 않는 문제가 발생합니다.
-- 따라서 이 때 중복되는 데이터 1건은 중복된다면 무시하고
-- 이후 나머지 99개 데이터는 중단 없이 정상적으로 입력하도록 만들 수 있습니다.
CREATE TABLE memberTbl(
	user_id VARCHAR(6) PRIMARY KEY,
    user_name VARCHAR(3) NOT NULL,
    addr VARCHAR(3) NOT NULL
);

-- MySQL은 구문을 통째로 묶어서 실행할 경우 모두 실행하거나 모두 실행하지 않습니다.
INSERT INTO memberTbl VALUES ('LSH', '이상혁', '서울'); -- ('HS', '허수', '울산'), ('JJH', '정지훈', '인천');
INSERT INTO memberTbl VALUES ('HS', '허수', '울산');
INSERT INTO memberTbl VALUES ('JJH', '정지훈', '인천');

-- 추가 데이터를 입력하되 한 건은 중복, 두 건은 중복 없도록 세팅
INSERT INTO memberTbl VALUES ('LSH', '이상혁', '서울');
INSERT INTO memberTbl VALUES ('KHK', '김혁규', '경기');
INSERT INTO memberTbl VALUES ('PDH', '박도현', '충청'); -- 드래그해서 위에 번개표시를 누르면 한번에 실행되나, 중복데이터가 있어 실행되지 않는다.

-- 만약 PRIMARY KEY가 겹치면 무시하고 그렇지 않으면 입력해주는 코드로 변환
-- INSERT와 INTO 사이에 IGNORE -> 자리가 없으면 무시
INSERT IGNORE INTO memberTbl VALUES ('LSH', '이상혁', '서울');
INSERT IGNORE INTO memberTbl VALUES ('KHK', '김혁규', '경기');
INSERT IGNORE INTO memberTbl VALUES ('PDH', '박도현', '충청'); -- 위 3줄을 드래그해서 실행할 때 중복되는 한줄은 무시하고 실행한다.

-- 만약 IGNORE 구문은 기존 데이터를 유지하고 신규 데이터를 막는 구문이었는데
-- 이미 존재하는 데이터가 있어도 신규데이터로 갱신해서 넣고 싶은 경우
-- ON DUPLICATE KEY UPDATE user_name = '이성혁', addr = '제주';
-- 자리가 없으면 수정 (IGNORE와 상호 보완 관계)
INSERT INTO memberTbl VALUES ('LSH', '이성혁', '제주');

INSERT INTO memberTbl VALUES ('LSH', '이성혁', '제주')
	ON DUPLICATE KEY UPDATE user_name = '이성혁', addr = '제주'; -- id는 그대로 하고 이름과 주소를 갱신한다.
-- -> 없으면 ('LSH', '이성혁', '제주') 그대로 넣고 있으면 user_name = '이성혁', addr = '제주'로 넣어라..라는 구문

-- ON DUPLICATE KEY UPDATE는 자료가 없으면 INSERT INTO에 적힌 대로 데이터를 넣고
-- 자료가 겹치는 상황인 경우에 ON DUPLICATE KEY UPDATE를 실행하는 구문이기 때문에
-- 만약 데이터가 겹치지 않았을 경우 그대로 INSERT INTO를 실행합니다.
-- 기존 테이블 요소와 겹치지 않는것을 넣어서 잘 들어가는지 CMD를 이용해 실행한 후 확인해주세요.

-- [사용자 계정 관리하기]
-- 현재 root 계정은 모든 권한(수정, 삭제, 조회, 변경, 계정생성 등)
-- 을 가지고 있는 계정입니다.
-- 그렇지만 모든 사람이 모든 권한을 가지는 일은 그만큼 DB접근이 용이해져 위험을 내포하고 있으며
-- 작년 초에도 유명 게임사에서 DB를 날려먹는 사건이 발생한 만큼
-- 일정 규모 이상의 개발사에서는 직급이나 권한별로 DB계정을 나눠서 관리합니다.
-- 이제 ROOT가 아닌 사용자를 만들고, 그 사용자에 대해서
-- 권한 부여를 하는 방법과 권한 개념에 대해 알아보겠습니다.

-- workbench에서 계정생성 및 권한부여하기.
-- 1. 좌측의 navigator에서 Administration 탭을 클릭합니다.
-- 2. Users and Privileges를 클릭합니다.
-- 3. 열리는 화면에서 좌하단 Add Account를 클릭하신 다음
--    Login name, password 등을 입력합니다.
-- 4. 우하단 apply를 누르면 계정생성이 완료됩니다.
-- 5. Account Limits는 시간당 기능 사용 가능 횟수를 의미합니다.
-- 6. Administrative Roles는 어떤 구문 실행까지 허용할지 입니다.

-- CMD환경에서 생성하는 경우는
-- CREATE USER 계정명@'%' IDENTIFIED BY '비밀번호';
-- GRANT ALL on *.* TO 계정명@'%' WITH GRANT OPTION;
-- 위 두 줄을 이용해서 생성할 수도 있습니다.
-- ict02 계정은 CMD환경에서 여러분들이 만들어주세요. 비밀번호는 ictict02입니다.

-- 계정 접속 방법
-- CMD(커맨드라인) 접속시 mysql -u 계정명 -p 로 연결가능
-- 접속 후 show databases;를 이용해 DB(스키마)목록 확인 가능
-- 계정목록(현재 mysql에서 쓸 수 있는 생성된 계정 전체) 조회를 하고 싶은 경우
-- 1. use mysql;
-- 2. SELECT user, host FROM user; 를 하면 내 DB에 등록된 계정 전체를 볼 수 있음.
use mysql;
SELECT user, host FROM user; -- 워크벤치에서 되는건 CMD에서도 된다.

-- icttest02 계정을 만들어주세요. 권한은 따로 주지말고 생성만 해주세요.
-- CMD에서 생성후 캡쳐해서 저한테 보내주시면 됩니다.
-- 비밀번호는 ictict02로 하겠습니다.

-- Workbench에서 주기
-- Navigator 하단 Administration에서 유저 선택 후 Administrative Roles에서
-- 주고싶은 권한을 모두 체크해주시면 됩니다(DBA 선택시 root와 동일한 권한 획득)

-- CMD에서는 위에 필기한 내용으로 전체 권한을 줄 수 있고,
-- 일부 권한을 줄 때는 아래와 같이 줍니다.
-- GRANT 권한1, 권한2... ON DB명.테이블명 TO 아이디@'%';
-- ict_practice2 데이터베이스(스키마)의 testTbl3 테이블에 대한 SELECT, DELETE권한만
-- 가지도록 icttest02계정에 권한을 부여한다면
-- GRANT SELECT, DELETE ON ict_practice2.testTbl3 TO icttest02@'%';
GRANT SELECT, DELETE ON ict_practice2.testTbl3 TO icttest02@'%';

-- CMD에서 testTbl3의 내용을 SELECT로 조회해서 캡쳐해서 보내주세요.
-- 1. DELETE로 하나 아무거나 삭제해서 캡쳐해서 보내주시고
-- 2. INSERT구문이 안먹히는것까지 캡쳐해서 보내주시면 됩니다.

-- 권한 뺏기
-- GRANT 대신 REVOKE를 쓰면 권한을 뺏어올 수 있습니다.
-- REVOKE 권한1, 권한2... ON DB명.테이블명 FROM 계정명;
-- 로그아웃 후 ict02로 로그인해서 icttest02의 SELECT 권한을 회수해 캡쳐해주세요.
-- 그 다음 testTbl3에 대한 SELECT가 거부되는 장면을 캡쳐해주세요.

-- DELETE 할 때 WHERE를 하면 SELECT로 간주되는 것 같다...





SELECT * FROM memberTbl;