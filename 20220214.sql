-- 1. 2021년 가입자중 가입일이 제일 빠른 사람보다 키가 큰 사람을 조회해주세요.
-- 날짜도 부등호로 조회 가능합니다.(작다 : 이전날짜, 크다 : 이후날짜)

-- 1. 2021년 가입자중 가입일이 제일 빠른 사람의 가입일자 구하기
SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01';
-- 2. 1의 쿼리문을 조건으로 해서 가입일이 제일 빠른 사람의 키 구하기.
SELECT height FROM userTbl WHERE reg_date = 
	(SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01');
-- 3. 2에서 구한 키를 조건으로 해서 최종적인 명단을 얻어냄
SELECT * FROM userTbl WHERE height > 
	(SELECT height FROM userTbl WHERE reg_date = 
	(SELECT min(reg_date) FROM userTbl WHERE reg_date >= '2021-01-01'));

-- 유저를 여섯명 더 추가해보겠습니다.
INSERT INTO userTbl VALUES ('KJV', '김자바', 1983, '서울', '01472583696', 171, '2020-08-15');
INSERT INTO userTbl VALUES ('ADR', '압둘라', 1995, '경기', '01523649876', 183, '2021-04-21');
INSERT INTO userTbl VALUES ('YSO', '야스오', 2001, '부산', '01689473525', 165, '2021-10-08');
INSERT INTO userTbl VALUES ('ZYA', '장위안', 1985, '부산', '01010120125', 164, '2020-02-28');
INSERT INTO userTbl VALUES ('JSP', '쟈스피', 1989, '전라', '01077777777', 177, '2022-01-01');
INSERT INTO userTbl VALUES ('SPR', '스프링', 1987, '강원', '01071654987', 184, '2021-12-31');

SELECT * FROM userTbl;

-- ANY, ALL, SOME 구문은 서브쿼리와 조합해서 사용합니다.
-- 지역이 서울인 사람보다 키가 작은 사람을 찾는 쿼리문
-- 1. 서울사람의 키 전체 리스트 가져오기
SELECT height FROM userTbl WHERE addr = '서울';

-- 위 구문을 서브쿼리로 해서 서울사람보다 키가 작은 사람을 찾을 경우 에러가 납니다.
-- 현재 데이터셋은 2개인데 어느 데이터를 기반으로
-- height을 잡아줄지 모호하기 때문에 에러가 납니다.
SELECT * FROM userTbl WHERE height < 
	(SELECT height FROM userTbl WHERE addr = '서울');

-- ANY 구문을 사용하면 모든 데이터에 대해 OR로 처리가 됩니다.
-- 개별값 모두에 대해 OR처리가 붙고 그래서 아래와 같이
-- (height < 168) OR (height < 171) -> 3개 이상도 된다.
-- 두개 조건이 OR로 연결됩니다.
-- ANY는 OR로 연결된다는 특성상 범위가 가장 넓은 조건 하나로 통일됩니다. -> (height < 171)
-- 현재 코드는 171보다 작은 데이터는 전부 잡혀서 나옵니다.
-- ANY와 SOME은 사실상 차이가 없는 구문입니다.
-- 아래 ANY가 들어갈 자리에 SOME을 대신 넣어도 똑같이 작동합니다.
SELECT * FROM userTbl WHERE height < ANY -- ANY 대신 SOME을 넣어도 된다.
	(SELECT height FROM userTbl WHERE addr = '서울');

-- ALL구문을 사용하면 모든 데이터가 AND로 처리됩니다.
-- 개별값 모두에 대해 AND처리가 붙고 그래서 아래와 같이
-- (height < 168) AND (height < 171)
-- 쿼리문을 작성해서 AND구문을 이용해(직접 ALL키워드를 기입해서 작성해주세요) 조회해보세요.
SELECT * FROM userTbl WHERE height < ALL 
	(SELECT height FROM userTbl WHERE addr = '서울');
    
-- ORDER BY는 결과물의 개수나 종류에는 영향을 미치지 않지만
-- 결과물을 순서대로(오름차순, 내림차순)정렬하는 기능을 가집니다.
-- SELECT 컬럼명 FROM 테이블명 ORDER BY 기준컬럼 정렬기준;
-- 정렬기준은 ASC(오름차순), DESC(내림차순) 이 있으며
-- 입력이 따로 없는 경우는 기본은 ASC로 잡습니다.
-- 가입한 날짜순(reg_date 순으로 오름차순)으로 조회해보겠습니다.
SELECT * FROM userTbl ORDER BY reg_date ASC;

-- 키 큰 순, 내림차순으로 조회하는 구문을 작성해보세요.
SELECT * FROM userTbl ORDER BY height DESC;

-- 정렬시 동점인 부분을 처리하기 위해 ORDER BY 절을 두 개 이상 동시에 나열할 수도 있습니다.
-- 아래 코드는 키로 오름차순을 하되, 동점이면 생년 내림차순으로 처리합니다.
SELECT * FROM userTbl ORDER BY height ASC, birth_year DESC; -- <- 키가 1순위, 동점이면 2순위로 생일순.

-- 만약에 문자를 내림차/오름차 순으로 나열한다면, 아스키코드 순으로 ORDER BY 정렬이 들어갑니다.
-- user_name 으로 ORDER BY를 걸어보세요.
-- 아무것도 안 적고 컬럼지정만 하면 ASC
SELECT * FROM userTbl ORDER BY user_name ASC; -- 여기서 ASC를 빼도 된다.

-- 지역을 가나다라 역순으로 나열해주시되, 만약 지역이 같다면 이름 오름차순으로 정렬해주세요.
SELECT * FROM userTbl ORDER BY addr DESC, user_name ASC;

-- DISTINCT는 결과물로 나온 컬럼의 중복값을 다 제거하고
-- 고유값(각 값을 1개씩만 남긴 결과값)을 남겨줍니다.
-- 아래 코드는 지역종류 7개(데이터 개수는 11개)를 파악하기 어렵습니다.
SELECT addr FROM userTbl;

-- 중복값을 하나로 집계하기 위해 출력컬럼 앞에 DISTINCT를 붙입니다.
SELECT DISTINCT addr FROM userTbl;

-- employees 스키마 지정을 키워드로 해주세요.
use employees;

-- 출력요소의 개수를 제한할 때는 limit 구문을 사용합니다.
-- 데이터가 300000개에 가깝다 보니 모든 데이터를 보여주지 않고 1000개만 보여줍니다.
SELECT * FROM employees; -- 0번부터 1000개를 보여주겠다는 의미.

-- 테이블명 뒤에 limit 숫자; 가 오는 경우는 적은 숫자 개수만큼만
-- 결과창에 보여줍니다.
-- 숫자를 하나만 적으면 자동으로 0번자료부터 n개를 보여줍니다.
-- 10개 출력해보세요.
SELECT * FROM employees LIMIT 10;

-- limit는 ORDER BY와 결합해 쓸 수 있습니다.
SELECT * FROM employees ORDER BY hire_date DESC limit 10;

-- 서브쿼리를 써야 하는 문제. 첫 10개를 입사일자 순으로 내림차순 처리해보세요.
-- FROM절 다음에 서브쿼리를 써주세요.
-- 일정 데이터셋을 먼저 넣어놓고, 얻어놓은 데이터셋을 내부적으로 정렬시킬때도 서브쿼리를 씁니다.
SELECT * FROM (SELECT * FROM employees LIMIT 10) e ORDER BY hire_date DESC; -- 테이블명(alias)을 지어줘야한다. 꼭 기억하자.

-- 만약 limit 숫자1, 숫자2; 와 같이 숫자 2개를 넣는 경우는
-- 숫자 1번부터 숫자2에 기입한 갯수만큼 보여줍니다.
SELECT * FROM employees limit 5, 10;

-- employees에 대해서 20번 부터 30개를 출력해보세요.
SELECT * FROM employees limit 20, 30;

-- GROUP BY는 같은 데이터를 하나의 그룹으로 묶어줍니다.
-- 조건절은 WHERE이 아닌 HAVING 절로 처리하게 됩니다.
-- ict_practice2를 잡아주세요.
use ict_practice2;

-- 하기 데이터에서 각 인물별로 구매한 개수 총합을 구해보겠습니다.
SELECT user_id, amount FROM buyTbl ORDER BY user_id;
-- SELECT 컬럼명, 집계함수(컬럼명2)... FROM 테이블명 GROUP BY 묶어서집계할컬럼명;
SELECT user_id, sum(amount) FROM buyTbl GROUP BY user_id; -- sum이 있을때와 없을때의 차이점을 알아야 한다.

-- 각 유저별 총 구매액을 구해주세요.
-- 총 구매액은 가격 * 개수의 결과를 다 더한 것입니다.
-- 가격은 price컬럼에, 개수는 amount컬럼에 있습니다.
-- 집계함수 sum의 소괄호 사이에서 +, * 등의 연산을 할 수 있습니다.
SELECT user_id, sum(amount * price) as '총구매액' FROM buyTbl GROUP BY user_id; -- as를 빼고 총구매액을 적어도 된다.
SELECT * FROM buyTbl;

-- 각 유저별 구매 물품의 평균가를 구해주세요(총액 아님). 평균은 avg()로 처리합니다.
-- avg()로 처리한 평균가 컬럼의 명칭은 "평균구매금액" 으로 변경해보세요.
SELECT user_id, avg(price) as "평균구매금액" FROM buyTbl GROUP BY user_id; -- avg(price * amount)가 아니다 평균...

-- 자주쓰는 집계함수 정리(통계적 결과를 얻기 위해 사용)
-- AVG() 평균
-- MIN() 최소값
-- MAX() 최대값
-- COUNT() 결과 row의 개수
-- COUNT(DISTINCT) 종류 개수
-- STDEV() 표준편차 -> 정규분포 등 통계학 공부를 해야한다.
-- VAR_SAMP() 분산 -> 평균만 가지고는 데이터의 분포를 알 수 없음 -> 편차제곱의 평균(분산)에 제곱근을 건 것이 표준편차이다.

-- userTbl에서 키가 제일 큰 회원의 이름과 키를 표시해주세요.
-- 서브쿼리로 height 절을 처리해야 합니다.
SELECT user_name, height FROM userTbl WHERE height = 
	(SELECT max(height) FROM userTbl);

-- userTbl에서 키가 가장 작은 회원의 키와 이름을 표시해주세요.
SELECT user_name, height FROM userTbl WHERE height = 
	(SELECT min(height) FROM userTbl);

-- userTbl 테이블의 가입자 전체의 평균 키를 구해주세요.
SELECT AVG(height) FROM userTbl;


-- 기존 쿼리문에서의 조건절은 WHERE절을 이용해서 처리했습니다.
-- 하지만 GROUP BY 를 통해 집계하는 경우, WHERE절을 받을 수가 없습니다.
-- 대신 조건절을 HAVING으로 대체해 사용합니다.
-- WHERE과 사용법은 완전히 동일합니다.
-- 우선 사용자별 총 금액을(buyTbl)다시 구해보겠습니다.
-- sum(price * amount)를 활용해서 작성해주세요.
SELECT user_id, sum(price * amount) as '총 금액' FROM buyTbl GROUP BY user_id;

-- 구매액이 250000을 넘는 사람만 남겨보겠습니다.
-- WHERE처럼 사용하시되 HAVING이라고 적어서 조건식을 붙여보세요.
-- 집계함수를 사용한 컬럼은 명칭이 없으므로 별명을 붙여서 조건식을 써야 합니다.
SELECT user_id, sum(price * amount) b FROM buyTbl 
	GROUP BY user_id HAVING sum(price * amount) > 250000;


SELECT * FROM buyTbl;
SELECT * from userTbl;