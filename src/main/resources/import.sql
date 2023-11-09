create table if not exists validity (
       validityId bigint,
       validityName varchar(30),
       primary key (validityId)
    );

INSERT INTO validity (validityId, validityName) VALUES (2223, '2022/2023');
INSERT INTO validity (validityId, validityName) VALUES (2324, '2023/2024');

create table if not exists reference (
       code bigint,
       income real,
       primary key (code)
    );

INSERT INTO reference (code, income) VALUES (232412080, 1.2);
