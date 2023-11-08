\echo �������� ��������� SQL-�������, ������������ ������� �� ������ ������� � ���������� ������� (���� � ������� �� ����������� ���� �������)

\echo ������� ��� ������� jaegers
SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;

\echo ������� �� ������, ������� ������������� �� ������������ jaegers
SELECT *
    FROM     jaegers
    WHERE    status = 'Active'
    ORDER BY model_name ASC;

\echo ������� ������� ���������� �����: Mark-1 � Mark-4
SELECT *
    FROM     jaegers
    WHERE    mark IN ('Mark-1', 'Mark-4')
    ORDER BY model_name ASC;

\echo ������� ���� �������, ����� Mark-1 � Mark-4
SELECT *
    FROM     jaegers
    WHERE    mark NOT IN ('Mark-1', 'Mark-4')
    ORDER BY model_name ASC;

\echo ������������ ������� �� �������� �� ������� mark
SELECT *
    FROM     jaegers
    ORDER BY mark DESC;

\echo ������� ���������� � ����� ������ ������
SELECT *
    FROM     jaegers
    WHERE    launch = (SELECT MIN(launch)
                           FROM jaegers)
    ORDER BY model_name ASC;

\echo ������� ���������� � �������, ������� ���������� ������ ���� kaiju
SELECT *
    FROM     jaegers
    WHERE    kaiju_kill = (SELECT MAX(kaiju_kill)
                               FROM jaegers)
    ORDER BY model_name ASC;

\echo ���������� ������� ��� �������, �������� ��� �� ��� ������ ����� �������		
SELECT ROUND(AVG(weight), 3) AS avg_weight
    FROM     jaegers
    GROUP BY model_name
    ORDER BY model_name ASC;

\echo ��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������, � ����� ���������� �������
SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;

UPDATE    jaegers
    SET   kaiju_kill = kaiju_kill + 1
    WHERE status <> 'Destroyed';

SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;

\echo ������� ������������ �������, � ����� ���������� ����������
DELETE
    FROM  jaegers
    WHERE status = 'Destroyed';

SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;