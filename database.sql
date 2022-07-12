-- DATABASE : help

CREATE DATABASE IF NOT EXISTS help;

-- SCHEMA: entities

-- DROP SCHEMA IF EXISTS entities ;

CREATE SCHEMA IF NOT EXISTS entities
    AUTHORIZATION postgres;

-- Table: entities.careers

-- DROP TABLE IF EXISTS entities.careers;

CREATE TABLE IF NOT EXISTS entities.careers
(
    career_id serial NOT NULL,
    career_name character varying(100) COLLATE pg_catalog."default" NOT NULL,
    career_semesters integer,
    created timestamp without time zone,
    enabled boolean DEFAULT true,
    archieved boolean DEFAULT false,
    CONSTRAINT careers_pkey PRIMARY KEY (career_id),
    CONSTRAINT careers_career_name_key UNIQUE (career_name),
    CONSTRAINT cacareer_semesters_check CHECK (career_semesters > 0 AND career_semesters > 7)
)