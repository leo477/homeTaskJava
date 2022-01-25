--Restricting AND Sorting Data
--Таблица Employees. Получить список с информацией обо всех сотрудниках
SELECT * FROM Employees
--Таблица Employees. Получить список всех сотрудников с именем 'David'
SELECT * FROM Employees WHERE firstName='David'
--Таблица Employees. Получить список всех сотрудников с job_id равным 'IT_PROG'
SELECT * FROM Employees WHERE job_id = 'IT_PROG'
--Таблица Employees. Получить список всех сотрудников из 50-го отдела (department_id) 
--с зарплатой (salary), более 4000
SELECT * FROM Employees WHERE department_id=50 AND salary>4000
--Таблица Employees. Получить список всех сотрудников из 20-го и из 30-го отдела (department_id)
SELECT * FROM Employees WHERE department_id in (20,30)

--Using Conversion Functions AND Conditional Expressions
--Таблица Employees. Получить список всех сотрудников пришедших на работу в первый день месяца (любого)
SELECT * FROM Employees WHERE  day(dateCome)=1
--Таблица Employees. Получить список всех сотрудников пришедших на работу в 2008 году
SELECT * FROM Employees WHERE  year(dateCome)=2008
--Таблица DUAL. Показать завтрашнюю дату в формате: Tomorrow is Second day of January

SELECT concat('Tomorrow is ',date_format(date_add(now(), interval 1 day),'%d') , ' day of ',date_format(date_add(now(), interval 1 day),'%M')) as text
FROM DUAL
--Таблица Employees. Получить список всех сотрудников и дату прихода на работу каждого в формате: 21st of June, 2007
SELECT StaffName, format(dateCome,"%D of %M, %Y") FROM Employees
--Таблица Employees. Получить список всех сотрудников, которые пришили на работу в феврале 2007 года.
SELECT * FROM Employees WHERE  year(dateCome)=2008 AND month(dateCome)=2


--Reporting Aggregated Data Using the Group Functions
--Таблица Employees. Получить репорта по department_id с минимальной и
 --максимальной зарплатой, с ранней и поздней датой прихода на работу и с 
 --количеством сотрудников. Сорировать по количеству сотрудников (по убывающей)

 SELECT department_id , max(salary), min(salary), max(dateCome), min(dateCome) FROM Employees
 group by department_id

 --Таблица Employees. Сколько сотрудников имена которых начинаются с 
 --одной и той же буквы? Сортировать по количеству. Показывать только те, 
 --где количество больше 1
 SELECT left(staffName,1) as name, count(staffName) FROM Employees 
 group by name having count(staffName)>1
 --Таблица Employees. Сколько сотрудников работают в одном и тоже отделе и получают одинаковую зарплату?
 SELECT department_id,salary, count(staffName) FROM Employees
 group by department_id, salary
 --Таблица Employees. Получить репорт, сколько сотрудников взяли на работу в каждый день недели. Сортировать по количеству
 SELECT date_format(dateCome,'%W') as weekday, count(staffName) FROM Employees
 group by weekday 
 --Таблица Employees. Получить репорт сколько сотрудников взяли на работу по годам. Сортировать по количеству
  SELECT date_format(dateCome,'%Y') as year, count(staffName) FROM Employees
 group by year 

 --Displaying Data FROM Multiple Tables Using Joins
 --Таблица Employees, Departamentos, Locations, Countries, Regions. Получить список регионов и количество сотрудников в каждом регионе
 SELECT Departamentos.department_name, count(staffName) FROM
 Departamentos inner join Employees on Departamentos.department_id=Employees.department_id
 inner join Locations on Locations.locations_id=Departamentos.locations_id
 inner join Regions on Regions.region_id=Locations.region_id
  inner join Countries on Countries.country_id=Regions.country_id
   
group by Departamentos.department_name
--Таблица Employees, Departamentos, Locations, Countries, Regions. Получить подробную информацию о каждом сотруднике:
--First_name, Last_name, Departamento, Job, Street, Country, Region
 SELECT Employees.First_name,Employees.Last_name,Departamentos.Departamento, Employees.Job,
 Locations.Street, Countries.Country, Regions.Region
FROM  Employees inner join Departamentos on Departamentos.department_id=Employees.department_id
 inner join Locations on Locations.locations_id=Departamentos.locations_id
 inner join Regions on Regions.region_id=Locations.region_id
  inner join Countries on Countries.country_id=Regions.country_id
--Таблица Employees, Departaments. Показать все департаменты в которых работают более 30 сотрудников
SELECT Departaments.name, count(Employees.staffName) FROM
Departaments join Employees on Departaments.department_id=Employees.department_id
group by Departaments.name having count(Employees.staffName)>30
--Таблица Employees, Departaments. Показать всех сотрудников не находящихся ни в одном департаменте
SELECT Employees.staffName FROM
Employees left join Departaments on Departaments.department_id=Employees.department_id
WHERE Departaments.department_id is null
--Таблица Employees, Departaments. Показать все департаменты, в которых нет сотрудника
SELECT Departaments.name FROM
Departaments left join Employees on Departaments.department_id=Employees.department_id
WHERE Employees.staffName is null

--Using Subqueries to Solve Queries
--Таблица Employees. Получить список сотрудников с самым длинным именем.
SELECT staffName FROM Employees
WHERE length(staffName) = (SELECT max(length(staffName)) FROM Employees)
--Таблица Employees. Получить список сотрудников с зарплатой больше средней зарплаты всех сотрудников.
SELECT staffName FROM Employees
WHERE salary > (SELECT avg(salary) FROM Employees)
--Таблица Employees, Departaments. Показать все департаменты, в которых нет сотрудника
SELECT Departaments.name FROM Departaments 
WHERE department_id not in (SELECT department_id FROM Employees)
--Таблица Employees, Departaments. Показать сотрудников, работающих в департаменте IT
SELECT staffName FROM Employees
WHERE department_id in (SELECT department_id FROM Departaments WHERE name='IT')
--Таблица Employees. Показать всех сотрудников не являющихся менеджерами
SELECT staffName FROM Employees
WHERE id in (SELECT id FROM Employees WHERE position not like '%Manager%')

--Используя Single-Row Functions to Customize Output
--Таблица Employees. Получить список всех сотрудников, у которых длина имени более 10 букв.
SELECT staffName FROM Employees
WHERE length(staffName)>10
--Таблица Employees. Получить список всех сотрудников, у которых в имени есть буква 'b' (без учета регистра)
SELECT staffName FROM Employees
WHERE lower(staffName) like '%b%'
--Таблица Employees. Получить список всех сотрудников, в которых в имени содержатся минимум 2 буквы 'a'
SELECT staffName FROM Employees
WHERE staffName like '%a%a%'
--Таблица Employees. Получить список всех сотрудников зарплата которых кратна 1000
SELECT staffName FROM Employees
WHERE (salary%1000)=0
--Таблица Employees. Получить список всех сотрудников у которых последняя буква в имени равна 'm' и длинной имени больше 5ти
SELECT staffName FROM Employees
WHERE right(staffName,1)='m' AND length(staffName)>5