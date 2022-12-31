DROP DATABASE IF EXISTS TFMS;
CREATE DATABASE TFMS;  # This is my main database
USE TFMS;


DROP TABLE IF EXISTS Trainer;
CREATE TABLE Trainer
(
	trainer_id char(4) primary key,
    trainer_name varchar(30) not null,
    track varchar(10),
    qualification varchar(20),
    experience varchar(40)
); 

DROP TABLE IF EXISTS Associate;
CREATE TABLE Associate
(
	#ID INT AUTO_INCREMENT,
	trainee_name varchar(30) not null,
    trainee_id int(4) AUTO_INCREMENT primary key,
    track varchar(10),
    qualification varchar(20),
    experience varchar(40),
    trainer_id char(4) not null,
    FOREIGN KEY (trainer_id) REFERENCES Trainer(trainer_id)
); 

DROP TABLE IF EXISTS Batch;
CREATE TABLE Batch
(
	topic_name varchar(20) not null,
    trainer_id char(4),
    trainee_id int(4),
    start_date date not null,
    end_date date not null,
    primary key(trainer_id,trainee_id),
    FOREIGN KEY (trainer_id) REFERENCES Trainer(trainer_id),
    FOREIGN KEY (trainee_id) REFERENCES Associate(trainee_id)
    
);



DROP TABLE IF EXISTS Question;
CREATE TABLE Question
(
	question_id char(5) primary key,
    question_section varchar(20),
    question_text varchar(60)
    
);


DROP TABLE IF EXISTS Feedback;
CREATE TABLE Feedback
(
	trainer_id char(4),
    trainee_id int(4),
	question_id char(5) not null,
    FOREIGN KEY (question_id) REFERENCES Question(question_id),
    FOREIGN KEY (trainer_id,trainee_id) REFERENCES Batch(trainer_id,trainee_id)
);





