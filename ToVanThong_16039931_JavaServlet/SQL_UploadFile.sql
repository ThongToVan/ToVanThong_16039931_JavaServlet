CREATE DATABASE UploadFileServletDB;
CREATE TABLE contacts (
 contact_id int NOT NULL identity(1,1),
 first_name nvarchar(45) DEFAULT NULL,
 last_name nvarchar(45) DEFAULT NULL,
 photo image,
 PRIMARY KEY (contact_id)
)