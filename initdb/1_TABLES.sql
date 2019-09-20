create table person
(
    id bigint auto_increment,
    constraint users_pk
        primary key (id),
    `full_name` TEXT not null,
    `job_title` TEXT not null,
    `id_github` TEXT not null
);
create table users
(
    id bigint auto_increment,
    constraint users_pk
        primary key (id),
    username TEXT not null,
    password TEXT not null
);
create table experiences
(
    id bigint auto_increment,
    constraint experiences_pk
        primary key (id),
    company TEXT not null,
    `begin_date` TEXT not null,
    `end_date` TEXT not null,
    address TEXT not null,
    description TEXT not null
);
create table skills
(
    id bigint auto_increment,
    constraint skills_pk
        primary key (id),
    `skill_name` TEXT not null
);
create table hobbies
(
    id bigint auto_increment,
    constraint hobbies_pk
        primary key (id),
    `hobby_name` TEXT not null
);
create table projects
(
    id bigint auto_increment,
    constraint projects_pk
        primary key (id),
    `project_name` TEXT not null,
    `begin_date` TEXT not null,
    `end_date` TEXT not null,
    description TEXT not null,
    `git_link` TEXT not null
);

