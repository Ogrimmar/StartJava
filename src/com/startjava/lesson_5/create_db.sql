DROP TABLE IF EXISTS jaegers;

\c robots;

CREATE TABLE jaegers (
    id          SERIAL PRIMARY KEY,
    model_name  VARCHAR(20),
    mark        VARCHAR(20),
    height      REAL,
    weight      NUMERIC,
    status      VARCHAR(20),
    origin      VARCHAR(20),
    launch      DATE,
    kaiju_kill  INT
);

\include_relative init_db.sql
\include_relative queries.sql