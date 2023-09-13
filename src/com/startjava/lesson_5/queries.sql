\echo вывести всю таблицу jaegers
SELECT * 
  FROM jaegers;

\echo вывести те строки, которые соответствуют не уничтоженным jaegers
SELECT *
  FROM jaegers
 WHERE status = 'Active';

\echo вывести роботов нескольких серий: Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo вывести всех роботов, кроме Mark-1 и Mark-4
SELECT *
  FROM jaegers
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo отсортировать таблицу по убыванию по столбцу mark
SELECT *
  FROM jaegers
 ORDER BY mark DESC;

\echo вывести информацию о самом старом роботе
SELECT *
  FROM jaegers
  WHERE launch = (SELECT MIN(launch) 
					        FROM jaegers);
						
\echo вывести информацию о роботах, которые уничтожили больше всех kaiju
SELECT * 
  FROM jaegers
  WHERE kaiju_kill = (SELECT MAX(kaiju_kill)
					    FROM jaegers);

\echo вывести средний вес роботов		
SELECT AVG(weight) AS avg_weight
  FROM jaegers;

\echo увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены, а затем отобразить таблицу
SELECT * 
  FROM jaegers;
  
UPDATE jaegers
   SET kaiju_kill = kaiju_kill + 1
 WHERE status NOT LIKE 'Destroyed';

SELECT * 
  FROM jaegers;

\echo удалить уничтоженных роботов, а затем отобразите оставшихся
DELETE 
  FROM jaegers
 WHERE status LIKE 'Destroyed';

SELECT *
  FROM jaegers;