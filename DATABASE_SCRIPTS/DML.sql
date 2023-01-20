
USE TFMS;

DELETE FROM trainer;

INSERT INTO  trainer 
VALUES 
('T101','GD','Android0.9','PHD',6),
('T102','Gopika','JDBC','ME',5 ),
('T103','Sathya','MySql','BE',6 ),
('T104','Akshay','Automation','ME',6 )
;
select * from trainer;

DELETE FROM Associate;

INSERT INTO  Associate 
(trainee_name,trainee_id,track,qualification,experience,trainer_id)
VALUES 
('Prathmesh','A102','Java Fullstack','ME',1,'T102'),
('Pranit','A101','Dot Net','BE',1,'T101'),
('Kunal','A104','Dot Net','BE',1,'T101'),
('Bhavesh','A103','Dot Net','BE',1,'T103'),
('Soham','A105','Dot Net','BE',1,'T103')
;

select * from Associate;


DELETE FROM Batch;

INSERT INTO  Batch 
VALUES 
('Java Fullstack','T102','A102','2017-08-25','2017-10-25'),
('Dot Net','T101','A101','2017-08-25','2017-10-25'),
('Dot Net','T101','A101','2017-08-25','2017-10-25'),
('Dot Net','T101','A101','2017-08-25','2017-10-25')


;

select * from Batch;


INSERT INTO  Question 
VALUES 
('Q1','INSTRUCTOR','Instructor knowledgeable and able to handle all your queries'),
('Q2','INSTRUCTOR','All the topics in a particular course handled by the trainer without any gaps or slippages'),
('Q3','COURSEMATERIAL',' This training will improve your job performance.'),
('Q4','COURSEMATERIAL','The course materials (presentation, hands-on,  etc.) referred during the training are relevant and useful.'),
('Q5','Learning Effectiveness','Knowledge and skills presented in this training are applicable at your work'),
('Q6','Environment','The course materials referand useful.'),
('Q7','Environment','The physical environment (e.g. classroom space, air-conditioning) was conducive to learning.'),
('Q8','Job Impact',' This training will improve your job performance.')

;

select * from Question;


select * from Feedback;



INSERT INTO  user 
VALUES 
('Rushi','abc@123','ADMIN'),
('Tony','abc@123','ASSOCIATE')
;
select * from user;

select topic as 'Topic',avg(rating) as 'Average Topic Rating' from feedback group by(topic);

select f.topic as 'Topic',q.question_section as 'Section',avg(f.rating) as 'Average Rating by Section' from Feedback f join Question q on f.question_id=q.question_id group by f.topic,q.question_section;

select t.trainer_name as 'Trainer',avg(f.rating) as 'Average Trainer Rating' from feedback f join trainer t on f.trainer_id=t.trainer_id group by f.trainer_id;

select avg(rating) from feedback;


INSERT INTO  Associate 
(trainee_name,trainee_id,track,qualification,experience,trainer_id)
VALUES 
('James','A202','Java Fullstack','ME',1,'T202');


INSERT INTO  trainer 
VALUES 
('T202','John','Junit','PHD',6);

delete from trainer where trainer_id='T202';
delete from Associate where trainee_id='A202';

insert into feedback value("T101","A101","J","Q1",3);
insert into feedback value("T101","A101","Junit","Q2",4);
select * from feedback;

delete from feedback where topic="Android0.9";


delete from Associate where trainee_name="Soham";
INSERT INTO  Associate 
VALUES 
('Soham','A105','Dot Net','BE',1,'T103');


select t.trainer_name as 'Trainer',avg(f.rating) as 'Average Trainer Rating' from feedback f join trainer t on f.trainer_id=t.trainer_id group by f.trainer_id having t.trainer_name='GD';
select * from user;

insert into user values('Soham','abc@123','ASSOCIATE');

select trainee_name from associate where trainee_id='A102';

Update user set username='Pranit' where username='Tony';
select * from user;