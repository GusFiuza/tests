create table if not exists validity (
       validityId bigint,
       validityName varchar(10),
       primary key (validityId)
    );

INSERT INTO validity (validityId, validityName) VALUES (1, '2022');
INSERT INTO validity (validityId, validityName) VALUES (2, '2023');

create table if not exists position (
       positionId bigint,
       positionName varchar(30),
       primary key (positionId)
    );

INSERT INTO position (positionId, positionName) VALUES (1, 'Gerente');

create table if not exists reference (
       code bigint,
       income real,
       primary key (code)
    );

INSERT INTO reference (code, income) VALUES (232412080, 1.2);
