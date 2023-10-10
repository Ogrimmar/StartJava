DROP TABLE IF EXISTS jaegers;

\c robots;

CREATE TABLE jaegers (
	id			SERIAL PRIMARY KEY,
	model_name	VARCHAR(20),
	mark		VARCHAR(20),
	height		REAL,
	weight		REAL,
	status 		VARCHAR(20),
	origin		VARCHAR(20),
	launch		DATE,
	kaiju_kill  INT
);

\include C:/Users/111/Desktop/StartJava/src/com/startjava/lesson_5/init_db.sql
\include C:/Users/111/Desktop/StartJava/src/com/startjava/lesson_5/queries.sql