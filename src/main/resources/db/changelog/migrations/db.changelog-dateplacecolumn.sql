--liquibase formatted sql
--changeset ivo:2025
--comment: date_placed Logs


ALTER TABLE CARDS ADD COLUMN date_placed TIMESTAMP;
