/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     11/19/2017 3:12:28 AM                        */
/*==============================================================*/

drop database conference;

create database conference;

use conference;

drop table if exists user;
drop table if exists submission;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user

(
   user_id              int not null AUTO_INCREMENT,
   user_name            char(100),
   first_name           char(100),
   last_name            char(100),
   phone_number         char(40),
   academic_title       char(100),
   address              char(100),
   email                char(100),
   password             char(255),
   repassword           char(255),
   organization         char(255),
   primary key (user_id)
);

/*==============================================================*/
/* Table: SUBMSSION                                             */
/*==============================================================*/
create table submission
(
   submission_id            int not null AUTO_INCREMENT,
   user_id              integer,
   track_id           int,
   title                text,
   authors              text,
   pdf_file             longblob,
   tex_file            longblob,
   abstract              text,
   keyword              text,
   primary key (submission_id)
);
