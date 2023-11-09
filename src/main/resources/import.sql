create table if not exists reference (
       id bigint auto_increment,
       code bigint,
       income real,
       primary key (id)
    );

INSERT INTO reference (code, income) VALUES (232412080, 1.2);
