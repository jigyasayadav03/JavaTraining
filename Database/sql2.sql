use jigyasa
//for creating a table
CREATE TABLE `jigyasa`.`Students_marks` (
  `roll_number` INT NOT NULL,
  `english` INT NULL DEFAULT 3,
  `hindi` INT NULL DEFAULT 3,
  `maths` INT NULL DEFAULT 3,
  `social` INT NULL DEFAULT 3,
  `science` INT NULL,
  PRIMARY KEY (`roll_number`));
  
  
  ///for inserting values in the table
  
  insert into Students_marks values(1,8,7,9,6,9);
  insert into Students_marks values(2,6,7,6,6,6);
  insert into Students_marks values(3,8, 8,9,8,9);
  insert into Students_marks values(4,7,7,5,8,7);
  insert into Students_marks values(5,8,7,9,9,9);
  insert into Students_marks values(6,9,9,9,9,9);
  insert into Students_marks values(7,8,7,9,7,8);
  insert into Students_marks values(8,8,5,4,5,9);
  insert into Students_marks values(9,8,7,9,6,9);
  select *from Students_marks;
  
  
SELECT Students.Roll_number,Students.Name,Students.Father_name, Students.Contact, Students.Address, 
Students_marks.english,Students_marks.hindi,
Students_marks.maths, Students_marks.social, Students_marks.science
FROM Students
INNER JOIN Students_marks ON Students.Roll_number=Students_marks.roll_number
where hindi >6;

select avg(maths) from Students_marks;
SELECT AVG(`maths`) AS AVG_maths, AVG(`english`) AS AVG_english FROM Students_marks;
SELECT MID("JIGYASA ", 5, 1) AS ExtractString;
SELECT lcase("JIGYASA");
select ucase("jigyasa");
select current_date();
select current_timestamp();

SELECT Students.Roll_number, Students.Name, Students.Father_name, Students.Contact, Students.Address,
       Students_marks.english, Students_marks.hindi, Students_marks.maths, Students_marks.social, Students_marks.science
FROM Students
left JOIN Students_marks ON Students.Roll_number = Students_marks.roll_number
WHERE Students_marks.hindi > 6;
