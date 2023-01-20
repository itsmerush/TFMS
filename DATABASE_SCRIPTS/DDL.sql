DROP DATABASE IF EXISTS TFMS;
CREATE DATABASE TFMS;  # This is my main database
USE TFMS;


DROP TABLE IF EXISTS Trainer;
CREATE TABLE Trainer
(
	trainer_id char(4) primary key,
    trainer_name varchar(30) not null,
    track varchar(20),
    qualification varchar(20),
    experience int
); 

DROP TABLE IF EXISTS Associate;
CREATE TABLE Associate
(
	#ID INT AUTO_INCREMENT,
	trainee_name varchar(30) not null,
    trainee_id char(4) primary key,
    track varchar(20),
    qualification varchar(40),
    experience int,
    trainer_id char(4) not null,
    FOREIGN KEY (trainer_id) REFERENCES Trainer(trainer_id)
); 

DROP TABLE IF EXISTS Batch;
CREATE TABLE Batch
(
	topic_name varchar(20) not null,
    trainer_id char(4),
    trainee_id char(4),
    start_date date not null,
    end_date date not null,
    
    FOREIGN KEY (trainer_id) REFERENCES Trainer(trainer_id),
    FOREIGN KEY (trainee_id) REFERENCES Associate(trainee_id)
    
);



DROP TABLE IF EXISTS Question;
CREATE TABLE Question
(
	question_id char(2) primary key,
    question_section varchar(40),
    question_text varchar(300)
    
);


DROP TABLE IF EXISTS Feedback;
CREATE TABLE Feedback
(
	trainer_id char(4),
    trainee_id char(4),
    topic varchar(20),
	question_id char(5) ,
    rating ENUM('1','2','3','4','5'),
    FOREIGN KEY (trainer_id) REFERENCES Trainer(trainer_id),
    FOREIGN KEY (trainee_id) REFERENCES Associate(trainee_id),
    FOREIGN KEY (question_id) REFERENCES Question(question_id)
    
    
);


DROP TABLE IF EXISTS user;
CREATE TABLE user
(
	username varchar(20),
    password varchar(20),
    role varchar(20)
    
);









