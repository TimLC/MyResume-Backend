create table persons
(
    id bigint auto_increment,
    constraint users_pk
        primary key (id),
    `fullName` TEXT not null,
    `jobTitle` TEXT not null,
    `idGithub` TEXT not null,
    `phoneNumber` TEXT not null,
    `emailAddress` TEXT not null,
    `linkedInLink` TEXT not null
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
    `beginDate` TEXT not null,
    `endDate` TEXT not null,
    address TEXT not null,
    description TEXT not null
);
create table skills
(
    id bigint auto_increment,
    constraint skills_pk
        primary key (id),
    `skillName` TEXT not null
);
create table hobbies
(
    id bigint auto_increment,
    constraint hobbies_pk
        primary key (id),
    `hobbyName` TEXT not null
);
create table projects
(
    id bigint auto_increment,
    constraint projects_pk
        primary key (id),
    `projectName` TEXT not null,
    `beginDate` TEXT not null,
    `endDate` TEXT not null,
    description TEXT not null,
    `gitLink` TEXT not null
);
create table messages
(
    id bigint auto_increment,
    constraint projects_pk
        primary key (id),
    `contactName` TEXT not null,
    `contactEmail` TEXT not null,
    subject TEXT not null,
    message TEXT not null
);

