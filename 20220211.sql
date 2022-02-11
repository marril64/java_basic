-- AUTO_INCREMENT(자동증가)
-- INT(정수) 자료형이 붙은 컬럼에만 붙일 수 있고, 이게 붙은 컬럼은 자동으로 1씩 증가하는 숫자를 배정받습니다.
-- 시작은 1입니다.
-- INSERT INTO 구문이 실행될 때 마다 해당 컬럼에 들어갈 숫자를 자동으로 배정해줍니다.
-- 한 번 사용된 숫자는 다시는 사용되지 않습니다.

-- FOREIGN KEY(외래 키)
-- 쇼핑몰의 구매자는 반드시 회원이어야 합니다.
-- 특정 테이블에 존재하는 값만 해당 컬럼에 들여올 수 있도록 거는 제약조건
-- FOREIGN KEY를 거는 컬럼의 자료형과 크기는 참조하는 쪽과 원본 모두 같아야 합니다.
-- 참조컬럼에 있는 값만(userTbl의 user_id에 존재하는 값만) buyTbl의 user에 올 수 있습니다.

-- 테이블 buyTbl을 생성해주세요.
CREATE TABLE buyTbl(
	order_number INT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(8) NOT NULL,
    prod_name VARCHAR(6) NOT NULL,
    group_name VARCHAR(4),
    price INT(7) NOT NULL,
    amount INT(3) NOT NULL,
    FOREIGN KEY(user_id) REFERENCES userTbl(user_id)
);

INSERT INTO userTbl VALUES('SDH', '신동호', 1989, '서울', '01099668908', 168, '2021-12-29');
INSERT INTO userTbl VALUES('SGY', '사공율', 1988, '대구', '01078945612', 175, '2021-11-20');
INSERT INTO userTbl VALUES('KGM', '김경민', 1989, '경기', '01065432102', 152, '2020-3-5');

-- 가입한 회원이 물건을 산 이력이 남도록 하겠습니다.
INSERT INTO buyTbl VALUES(null, 'SDH', '드럼스틱', '악기', 10000, 1);
INSERT INTO buyTbl VALUES(null, 'VSC', '스네어', '악기', 1000000, 1); -- 이래도 order_number는 1씩 증가한다.
-- order_number 컬럼은 값을 안주면(null을 주면) AUTO_INCREMENT에 의해 자동으로
-- 1씩 증가된 숫자를 배정받습니다.
INSERT INTO buyTbl VALUE(null, 'SDH', '스네어', '악기', 1300000, 1);

-- userTbl의 user_id에 없는 회원 아이디를 INSERT INTO로 넣어보세요.
INSERT INTO buyTbl VALUES(null, 'VSC', '스네어', '악기', 1000000, 1);

-- 회원 3명에 대한 구매이력을 1개씩 추가로 남겨주시고 저한테 쿼리문을 보내주세요.
INSERT INTO buyTbl VALUE(null, 'SGY', '키보드', '주변기기', 40000, 1);
INSERT INTO buyTbl VALUE(null, 'KGM', '일렉기타', '악기', 220000, 1);
INSERT INTO buyTbl VALUE(null, 'SDH', '트윈 페달', '악기', 540000, 1);

-- 유저를 두명 더 추가해주세요.
-- 정보는 전부 여러분들이 알아서 넣어주시되, 키는 한명은 160대로 해주시면 됩니다.
INSERT INTO userTbl VALUE('KSH', '김선화', 1989, '구미', '01012345678', 154, '2020-4-8');
INSERT INTO userTbl VALUE('OJB', '오정빈', 1990, '대구', '01014725836', 160, '2021-3-5');

-- 새로 추가한 2명의 구매내역을 추가해주세요.
-- 2명의 구매내역 3개를 추가해주세요(1명 1개, 1명 2개)
INSERT INTO buyTbl VALUE(null, 'OJB', '삼다수', '생필품', 24000, 2);
INSERT INTO buyTbl VALUE(null, 'KSH', '모니터', '주변기기', 600000, 1);
INSERT INTO buyTbl VALUE(null, 'KSH', '스피커', '주변기기', 50000, 1);

-- 여태까지의 SELECT 구문은 조건 없이 모든 데이터를 다 조회했습니다.
-- 극단적인 경우 employees 테이블의 모든 row를 다 조회하는(cmd환경) 경우
-- 조회시간이 말도 안되게 오래 잡히는 경우가 발생합니다.
-- 따라서 조건에 맞도록 필터링 하기 위해 WHERE 구문을 사용합니다.
-- SELECT 컬럼명1, 컬럼명2... FROM 테이블명 WHERE 컬럼명=조건식;
SELECT * FROM employees.employees;

-- 아래는 이름이 신동호인 사람만 조회하는 구문입니다.
SELECT * FROM userTbl WHERE user_name='신동호';

-- 서울에 사는 사람만 조회해보세요.
SELECT * FROM userTbl WHERE addr='서울';

-- 관계연산자를 이용해서 대소비교를 하거나
-- AND, OR을 이용해 조건 여러개를 연결할 수 있습니다.
-- 키 180 이상인 사람을 조회해주세요.
SELECT * FROM userTbl WHERE 180<=height;

-- AND를 이용해 91~99년생까지만 조회하는 구문을 만들어주세요.
SELECT * FROM userTbl WHERE birth_year >= 1991 AND birth_year <= 1999;

-- BETWEEN ~ AND 구문을 이용하면 birth_year를 한 번만 적고도
-- 해당 범위의 조회가 가능합니다.
-- 적은 두 개의 숫자는 포함됩니다.
SELECT * FROM userTbl WHERE birth_year BETWEEN 1991 AND 1999;

-- 위와 같이 숫자는 연속된 범위를 갖기 때문에 범위연산자로 처리가 가능하지만
-- addr같은 자료는 서울이 더 크다던가 영국이 더 작다던가 하는 연산적 처리가 불가능합니다.
-- 먼저 지역이 서울이거나 화성인 사람의 정보를 WHERE절로 보내주세요.
SELECT * FROM userTbl WHERE addr='서울' OR addr='화성';

-- in키워드를 사용하면 in (데이터1, 2, 3, 4...);
-- 특정 컬럼에 괄호에 담긴 데이터가 포함되는 경우를 전부 출력합니다.
-- 경기, 화성, 영국에 있는 사람들만 in 키워드로 조회해주세요.
SELECT * FROM userTbl WHERE addr in ('경기', '화성', '영국');

-- like 연산자는 일종의 표현 양식을 만들어줍니다.
-- like 연산자를 이용하면 %라고 불리는 와일드 카드나 혹은 _라고 불리는
-- 와일드 카드 문자를 이용해 매칭되는 문자나 문자열을 찾습니다.

-- 신씨를 찾는 케이스(%는 몇 글자가 오더라도 상관없음)
-- 아래 구문은 신으로 시작하는 모든 요소를 가져옵니다. '신'도 포함
SELECT * FROM userTbl WHERE user_name like '신%';

-- 휴대폰 번호가 01로 시작하는 모든 사람을 찾는 쿼리문을 작성해주세요.
SELECT * FROM userTbl WHERE phone_number like '01%';

-- 두 글자인 경우만 찾는 케이스(_는 하나에 한글자임)
SELECT * FROM userTbl WHERE user_name like '__'; -- 두 글자인 것만 찾겠다(_가 두개임)

-- user_id가 3글자이면서 H로 끝나는 사람만 조회하는 쿼리문을 날려주세요.
SELECT * FROM userTbl WHERE user_id like '__H'; -- AND user_id like '%H';

-- 서브쿼리(하위쿼리) 란 1차적 결과를 얻어놓고,
-- 거기서 다시 조회구문을 중첩해서 날리는 것을 의미합니다.
-- 신동호보다 키가 큰 사람을 조회하는 예시를 보겠습니다.

-- 원시적인 방법
-- 1. 신동호의 키를 WHERE절을 이용해 확인한다.
SELECT height FROM userTbl WHERE user_name = '신동호';
-- 2. 확인한 신동호의 키를 쿼리문에 넣는다.
-- 168보다 큰 사람의 이름과 키만 조회해보겠습니다.
SELECT user_name, height FROM userTbl WHERE height > 168;

-- 서브쿼리 활용 방법
-- 서브쿼리는 FROM 절 다음에 ()를 이용해서
-- SELECT 구문을 한 번 더 활용합니다. -> 괄호 안쪽 쿼리문이 먼저 실행되고 전체 쿼리문이 실행되는 방식.
SELECT user_name, height FROM userTbl WHERE height > (SELECT height FROM userTbl WHERE user_name = '신동호');

-- 서브쿼리를 이용해 '김선화' 보다 먼저 태어난 사람들만 골라내보세요.
-- 생년월일(날짜나 연도) 도 대소비교가 가능합니다. 큰 쪽이 최근, 작은 쪽이 더 이전
-- 쓰기 어렵다 싶으면 괄호 안쪽 쿼리문을 작성해놓고 바깥쪽 쿼리문을 작성하면 된다.
SELECT user_name FROM userTbl WHERE birth_year < 
	(SELECT birth_year FROM userTbl WHERE user_name = '김선화');
    
-- 최대값은 내장함수 max() 로 구합니다.
-- 현재 userTbl 테이블에서 가장 나이가 적은 사람의 생년 조회
SELECT max(birth_year) FROM userTbl;

-- user_id에 M이 포함된 사람들 중 키가 제일 작은 사람보다
-- 키가 더 큰 사람을 구하시오.(min을 활용하세요)
SELECT height FROM userTbl WHERE height > 
	(SELECT min(height) FROM userTbl WHERE user_id like '%M%');
    
-- 2021년 가입자 중 가입일이 제일 빠른 사람보다 키가 큰 사람을 조회해주세요.
-- 날짜도 부등호로 조회가 가능합니다.(작다 : 이전날짜, 크다 : 이후날짜)
SELECT height FROM userTbl WHERE height > 
	(SELECT height FROM userTbl WHERE reg_date = 
		(SELECT min(reg_date) FROM userTbl WHERE reg_date BETWEEN 20210101 AND 20211231));


    
-- UPDATE userTbl SET user_id = 'EM2' WHERE user_id = 'EM';

SELECT * FROM userTbl;
SELECT * FROM buyTbl;