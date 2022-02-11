-- 조회구문에 조건을 걸기 위해서 WHERE이라는 구문을 사용합니다.
-- SELECT 조회컬럼 FROM 테이블명 WHERE 컬럼명='조건에 맞는 값';
-- 이름이 신자바인 사람만 출력하기
SELECT * FROM users WHERE user_name='신자바';
-- 여러분들의 기준으로 필터링을 해 보세요
-- 아이디 기준으로 찾아보세요.
SELECT * FROM users WHERE id='marril';

-- 조건 여러개를 걸 경우 AND, OR키워드를 쓰시면 됩니다.
-- 아이디가 marril이거나 이름이 신자바인걸 가져오기
SELECT * FROM users WHERE id='marril' OR user_name='신자바';
-- AND 키워드를 이용해서 특정 조건을 2개 만족하는 데이터를 하나 가져와보세요.
SELECT * FROM users WHERE id='abc1234' AND user_name='신자바';

-- 데이터 수정하기
-- UPDATE 테이블명 SET 컬럼명1='값1', 컬럼명2='값2' ...;
-- 주의하실점은 WHERE을 걸지 않으면 해당 컬럼의 모든 값이 일괄적으로 바뀝니다.
-- users 테이블의 pw를 전부 'pppp'로 바꾸기
UPDATE users SET pw='pppp';
SET SQL_SAFE_UPDATES=1; -- 0이면 안전모드 비활성화, 1이면 다시 활성화

-- WHERE구문을 이용해 pw컬럼에 있는 5개의 값을 전부 다르게 바꿔주세요.
UPDATE users SET pw='abc' WHERE id='abc1234'; -- WHERE는 일반 구문이 끝나고 붙는다.
UPDATE users SET pw='def' WHERE id='fhdekfl123';
UPDATE users SET pw='ghi' WHERE id='mar';
UPDATE users SET pw='jkl' WHERE id='marril';
UPDATE users SET pw='mno' WHERE id='shin';

-- 마지막 하나는 이름과 비밀번호를 함께 바꿔주세요.
UPDATE users SET pw='pqr', user_name='새가' WHERE id='tork12';

-- 데이터 삭제
-- DELETE FROM 테이블명; 을 할 경우 테이블 전체 데이터가 싹 날아갑니다.
-- DELETE 구문도 역시 일반적으로 WHERE과 조합해서 사용합니다.
-- 제일 위쪽에 있는(abc1234) 회원정보를 삭제해보겠습니다.
DELETE FROM users WHERE id='abc1234';

-- 도서관 테이블 구성하기
CREATE TABLE library(
	book_name varchar(30) primary key,
    book_price int(7) not null,
    book_pub varchar(20) not null,
    book_writer varchar(10) not null,
    book_page int(5) not null
);

-- INSERT INTO 구문을 이용해 책을 6권 넣어보겠습니다. 양식에 맞게 테이블에 INSERT 해주세요.
INSERT INTO library VALUES ('해리포터', 6000,'문학수첩', 'j.k.롤링', 300);
INSERT INTO library VALUES ('반지의제왕', 7000, '어디선가', 'j.r.r톨킨', 350);
INSERT INTO library VALUES ('반야심경 마음공부', 14400, '유노북스', '페이융', 1400);
INSERT INTO library VALUES ('더킹덤바이블', 270000, '목양', '유석영', 1600);
INSERT INTO library VALUES ('자바의정석', 27000, '도우출판', '남궁성', 1000);
INSERT INTO library VALUES ('지옥의 메카니컬 드럼 트레이닝', 13500, 'SRMusic', 'go', 300);

SELECT * FROM library;
-- 실수로 다른곳에 library 테이블을 생성했다면 drop table library를 사용하면 library 테이블 자체가 삭제된다.
-- 테이블을 일괄적으로 날려버리는 명령어
drop table userTbl;

-- employees를 사용 스키마로 지정해주세요.(명령어로)
use employees;

-- employees 내부의 employees 테이블을 조회해주세요.
-- SQL구문 명령구문은 무조건 대문자, 테이블명이나 호칭 등은
-- 소문자로 작성하는 것이 관례입니다.
-- 무조건 지키지 않아도 실행은 가능하지만 가독성 측면을 위해 고수하는 경우가 많습니다.
SELECT * FROM employees; -- 1000row(s) returned

-- 원래 테이블을 조회할 때는 스키마명.테이블명으로 모두 표기해야 합니다.
SELECT * FROM employees.employees; -- 생략하고 싶으면 위처럼 use를 쓴다.

-- 스키마명.테이블명으로 조회할때는 use중이지 않은 스키마의 테이블도 조회할 수 있습니다.
-- ict_practice2의 library를 조회해보세요.
SELECT * FROM ict_practice2.library; -- ict_practice2를 use중이 아니기 때문에 전부 써야한다.

-- 컬럼을 전체가 아닌 임의로 가져올때는 컬럼명을 ,로 구분합니다.
-- 이 경우 모든 컬럼이 아닌 일부 컬럼만 조회할 수도 있으며
-- 심지어 한 개의 컬럼만 조회하는 등 개수조절도 가능합니다.
SELECT gender, first_name, last_name FROM employees;

-- CMD환경에서는 좌측 스키마처럼 스키마 목록을 보여주는 창이 없으므로
-- 아래 명령어를 이용해 SCHEMA 목록을 확인할 수 있습니다.
-- CMD환경 로그인 명령어 -> mysql -u 계정명 -p
SHOW databases;

-- 현재 DB정보를 조회하기 위해서는
SHOW TABLE STATUS;

-- 특정 테이블의 컬럼 정보를 보고싶다면 아래 명령어를 씁니다.
-- DESCRIBE 테이블명; 혹은 DESC 테이블명;
DESCRIBE employees;
DESC employees;

-- ict_practice2를 디폴트 스키마로 잡아주세요.
USE ict_practice2;

-- 테이블을 생성합니다.
-- 테이블 생성시 적힌 제약조건과 컬럼명을 이용해 만들어주세요.
CREATE TABLE userTbl(
	user_id varchar(8) primary key,
    user_name varchar(10) not null,
    birth_year int(4) not null,
    addr varchar(4) not null,
    phone_number varchar(11),
    height int(3),
    reg_date DATE
);

SELECT * FROM userTbl;






