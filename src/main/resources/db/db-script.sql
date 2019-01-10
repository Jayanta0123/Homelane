CREATE DATABASE homelane;

USE homelane;

CREATE TABLE `NOTES` (
	`ID`			INT NOT NULL AUTO_INCREMENT,
    `NOTE_TITLE`	VARCHAR(50) NOT NULL,
    `NOTE_TEXT`		VARCHAR(5000) NOT NULL,
    `CREATE_TIME`	TIMESTAMP NOT NULL,
    `IMPORTANCE`	ENUM('High', 'Medium', 'Low'),
    `COLOR_CODE`	VARCHAR(10),
    PRIMARY KEY (`ID`)
);


Select * from homelane.NOTES;

Insert into NOTES (NOTE_TITLE, NOTE_TEXT, CREATE_TIME, IMPORTANCE, COLOR_CODE)
Values
('Note 1', 'The apples taste good', Now(), 'High', 'Green');

Insert into NOTES (NOTE_TITLE, NOTE_TEXT, CREATE_TIME, IMPORTANCE, COLOR_CODE)
Values
('Note 2', 'Spring and Spring-Boot', Now(), 'High', 'Blue');

Insert into NOTES (NOTE_TITLE, NOTE_TEXT, CREATE_TIME, IMPORTANCE, COLOR_CODE)
Values
('Note 3', 'JPA and Hibernate', Now(), 'High', 'Blue');

Commit;