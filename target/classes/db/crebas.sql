/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     11/19/2017 3:12:28 AM                        */
/*==============================================================*/

drop database conference;

create database conference;

use conference;

drop table if exists user;

/*==============================================================*/
/* Table: user                                                  */
/*==============================================================*/
create table user

(
   user_id              int not null,
   user_name            char(100),
   first_name           char(100),
   last_name            char(100),
   midle_name           char(100),
   academic             char(100),
   zipcode              int,
   email                char(100),
   password             char(255),
   repassword           char(255),
   orgnization          char(255),
   primary key (user_id)
);

