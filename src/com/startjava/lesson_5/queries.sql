\echo ������� ��� ������� jaegers
SELECT * 
  FROM jaegers;

\echo ������� �� ������, ������� ������������� �� ������������ jaegers
SELECT *
  FROM jaegers
 WHERE status = 'Active';

\echo ������� ������� ���������� �����: Mark-1 � Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo ������� ���� �������, ����� Mark-1 � Mark-4
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo ������������� ������� �� �������� �� ������� mark
SELECT *
  FROM jaegers
 ORDER BY mark DESC;

\echo ������� ���������� � ����� ������ ������
SELECT *
  FROM jaegers
  WHERE launch = (SELECT MIN(launch) 
					        FROM jaegers);
						
\echo ������� ���������� � �������, ������� ���������� ������ ���� kaiju
SELECT * 
  FROM jaegers
  WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
					    FROM jaegers);

\echo ������� ������� ��� �������		
SELECT AVG(weight) AS avg_weight
  FROM jaegers;

\echo ��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������, � ����� ���������� �������
SELECT * 
  FROM jaegers;
  
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status NOT LIKE 'Destroyed';

SELECT * 
  FROM jaegers;

\echo ������� ������������ �������, � ����� ���������� ����������
DELETE 
  FROM jaegers
 WHERE status LIKE 'Destroyed';

SELECT *
  FROM jaegers;