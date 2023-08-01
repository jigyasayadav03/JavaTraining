use jigyasa
insert into Students values(2,'abhishek','ramker',7067248,'pithampur');
insert into Students values(3,'abhigya','harshit',94754,'indore');
insert into Students values(4,'Babita','raj',72343858,'pithampur');
insert into Students values(5,'chandani','rajesh',71232248,'manavar');
insert into Students values(6,'dipika','devendra',3445454,'dhar');
insert into Students values(7,'deepali','dilip',8962290,'Kishanganj');
select * from Students
insert into Students values(1,'Ayushi','deepak',8465290,'ujjain');
insert into Students values(8,'geeta','dilip',3432290,'guna');
insert into Students values(9,'geeta','roshan',99290,'khajraho');
select distinct Name from Students
select * from Students group by Address
SELECT Name
FROM Students
WHERE Name like '_a%'
GROUP BY Address
ORDER BY Name desc
SELECT Name
FROM Students
GROUP BY Address
ORDER BY Name DESC;
select max(Roll_number) from Students
select min(Roll_number) as minimun from Students
select sum(Roll_number) Studentsas sum from Students
select distinct Address from Students order by name DESC
select distinct Address from Students order by Address desc
select * from Students order by Address Asc
SELECT MAX(Roll_number) FROM Students WHERE Roll_number < (SELECT MAX(Roll_number) FROM Students); 
SELECT * FROM Students
WHERE NOT Address='pithampur';