-- 1. 데이터베이스 생성 명령
-- DB생성시 한글을 쓸 수 있도록 -> dafalut character set utf8;
create database ict_practice2 default character set utf8;

/* 우측 하단의 schemas 클릭 후 새로고침 한 다음 ict_practice2 우클릭
-> set as default schema를 클릭하세요. 이러면 현재 명령을 받을 DB로 생성됩니다.*/

-- default schema 지정은 명령어로도 할 수 있습니다.
-- use 스키마명; 을 사용하면 좌측 schemas에서 우클릭  후 default스키마 지정한 효과를
-- 낼 수도 있습니다.
use sys;
use ict_practice2;

/* 테이블 생성 명령
primary key - 컬럼의 주요 키를 뜻하며, 중복데이터를 방지합니다.
테이블 내의 하나의 컬럼은 반드시 primary key 속성을 가져야 표준을 따르는것입니다.
not null 도 포함된다.
not null - 데이터에 null 값이 들어오는 것을 방지합니다.

테이블은 클래스와 구조가 비슷합니다. 클래스 내부의 멤버변수를 지정하듯이
테이블 내부 요소를 지정할 수 있습니다.
varchar는 자바의 String과 호환됩니다.*/
CREATE TABLE users(
	id varchar(20) primary key,
    pw varchar(20) not null,
    user_name varchar(30) not null,
    email varchar(80) -- 입력 해도 안해도 되는 부분.
    );
    
    
/* 데이터 적재하기
INSERT INTO 테이블명 (컬럼1, 컬럼2...) VALUE(S) (컬럼1값, 컬럼2값...);
만약 모든 컬럼을 대상으로 지정시 컬럼은 생략하고 VALUE(S) 이후 값만 지정할 수 있다.
INSERT INTO 테이블명 VALUE(S) (컬럼1값, 컬럼2값...);*/
INSERT INTO users (id, pw, user_name, email) VALUE
	('abc1234', 'asdf', '신자바', 'asdf@asdf.com');
    
INSERT INTO users VALUES ('mar','ril','신동호','qwer@qwer.com');
INSERT INTO users VALUES ('marril','1234','신동호','marril@naver.com');
    
SELECT * FROM users;

-- 여러분이 계정 3개를 더 넣어주시되, 1개 계정은 이메일 없이 넣어주세요.
-- 이메일 없이 넣는 경우는 id, pw, user_name에만 값을 넣겠다고 선언해야 합니다.
INSERT INTO users VALUE ('fhdekfl123','848484','이자바','zxcv@qwer.com');
INSERT INTO users VALUE ('tork12','sksek12','박자바','tyui@qwer.com');
INSERT INTO users (id, pw, user_name) VALUE
	('ght123', 'pqow', '김자바');
INSERT INTO users VALUE ('shin', 'dong', '호야', null); -- null을 넣는 방법도 된다.
    
SELECT * FROM users; -- sql쿼리문은 대소문자 구분을 하지 않으나, 대문자로 적는 것을 권장한다.

/* 데이터 조회하기
SELECT 컬럼1, 컬럼2,... FROM 테이블명;
을 적으면 테이블에 적재된 데이터 조회 가능
SELECT * FROM 테이블명; 으로 조회시 해당 테이블 전체 컬럼 조회 가능 */
-- * 대신 컬럼명 기입으로 users 테이블의 전체 자료를 조회해보세요.
SELECT id, pw, user_name, email FROM users;
