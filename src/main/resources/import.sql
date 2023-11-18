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

INSERT INTO position (positionId, positionName) VALUES (1, 'Diretor');
INSERT INTO position (positionId, positionName) VALUES (2, 'Gerente');
INSERT INTO position (positionId, positionName) VALUES (3, 'Funcionário');

create table if not exists reference (
       validityId bigint,
       positionId bigint,
       income real,
       primary key (validityId, positionId)
    );

INSERT INTO reference (validityId, positionId, income) VALUES (1, 1, 1000.0);
