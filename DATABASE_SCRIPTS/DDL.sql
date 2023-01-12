DROP DATABASE IF EXISTS TFMS;
CREATE DATABASE TFMS;  # This is my main database
USE TFMS;


DROP TABLE IF EXISTS Trainer;
CREATE TABLE Trainer
(
	trainerId char(4) primary key,
    trainerName varchar(30) not null,
    track varchar(20),
    qualification varchar(20),
    experience varchar(40)
); 

DROP TABLE IF EXISTS Associate;
CREATE TABLE Associate
(
	#ID INT AUTO_INCREMENT,
	traineeName varchar(30) not null,
    traineeId int(4) AUTO_INCREMENT primary key,
    track varchar(20),
    qualification varchar(20),
    experience varchar(40),
    trainerId char(4) not null,
    FOREIGN KEY (trainerId) REFERENCES Trainer(trainerId)
); 

DROP TABLE IF EXISTS Batch;
CREATE TABLE Batch
(
	topicName varchar(20) not null,
    trainerId char(4),
    traineeId int(4),
    startDate date not null,
    endDate date not null,
    FOREIGN KEY (trainerId) REFERENCES Trainer(trainerId),
    FOREIGN KEY (traineeId) REFERENCES Associate(traineeId)
    
);



DROP TABLE IF EXISTS Question;
CREATE TABLE Question
(
	questionId char(5) primary key,
    questionSection varchar(20),
    questionText varchar(60)
    
);


DROP TABLE IF EXISTS Feedback;
CREATE TABLE Feedback
(
	trainerId char(4),
    traineeId int(4),
	questionId char(5) not null,
    rating ENUM('1','2','3','4','5'),
    FOREIGN KEY (questionId) REFERENCES Question(questionId),
    FOREIGN KEY (trainerId,traineeId) REFERENCES Batch(trainerId,traineeId)
);





