create table if not exists students (
       id bigint auto_increment,
       code bigint,
       last_name varchar(255),
       primary key (id)
    );

INSERT INTO students (code, last_name) VALUES (232412080, 'person');
