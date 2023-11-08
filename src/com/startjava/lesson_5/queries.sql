\echo Написать следующие SQL-запросы, отсортировав таблицы по именам роботов в алфавитном порядке (если в условии не указывается иной порядок)

\echo вывести всю таблицу jaegers
SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;

\echo вывести те строки, которые соответствуют не уничтоженным jaegers
SELECT *
    FROM     jaegers
    WHERE    status = 'Active'
    ORDER BY model_name ASC;

\echo вывести роботов нескольких серий: Mark-1 и Mark-4
SELECT *
    FROM     jaegers
    WHERE    mark IN ('Mark-1', 'Mark-4')
    ORDER BY model_name ASC;

\echo вывести всех роботов, кроме Mark-1 и Mark-4
SELECT *
    FROM     jaegers
    WHERE    mark NOT IN ('Mark-1', 'Mark-4')
    ORDER BY model_name ASC;

\echo отсортируйте таблицу по убыванию по столбцу mark
SELECT *
    FROM     jaegers
    ORDER BY mark DESC;

\echo вывести информацию о самом старом роботе
SELECT *
    FROM     jaegers
    WHERE    launch = (SELECT MIN(launch)
                           FROM jaegers)
    ORDER BY model_name ASC;

\echo вывести информацию о роботах, которые уничтожили больше всех kaiju
SELECT *
    FROM     jaegers
    WHERE    kaiju_kill = (SELECT MAX(kaiju_kill)
                               FROM jaegers)
    ORDER BY model_name ASC;

\echo отобразите средний вес роботов, округлив его до трёх знаков после запятой		
SELECT ROUND(AVG(weight), 3) AS avg_weight
    FROM     jaegers
    GROUP BY model_name
    ORDER BY model_name ASC;

\echo увеличить на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены, а затем отобразить таблицу
SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;

UPDATE    jaegers
    SET   kaiju_kill = kaiju_kill + 1
    WHERE status <> 'Destroyed';

SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;

\echo удалить уничтоженных роботов, а затем отобразите оставшихся
DELETE
    FROM  jaegers
    WHERE status = 'Destroyed';

SELECT *
    FROM     jaegers
    ORDER BY model_name ASC;