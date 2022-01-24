--Restricting and Sorting Data
--Таблица Employees. Получить список с информацией обо всех сотрудниках
select * from Employees
--Таблица Employees. Получить список всех сотрудников с именем 'David'
select * from Employees where firstName='David'
--Таблица Employees. Получить список всех сотрудников с job_id равным 'IT_PROG'
select * from Employees where job_id = 'IT_PROG'
--Таблица Employees. Получить список всех сотрудников из 50-го отдела (department_id) 
--с зарплатой (salary), более 4000
select * from Employees where department_id=50 and salary>4000
--Таблица Employees. Получить список всех сотрудников из 20-го и из 30-го отдела (department_id)
select * from Employees where department_id in (20,30)

--Using Conversion Functions and Conditional Expressions
--Таблица Employees. Получить список всех сотрудников пришедших на работу в первый день месяца (любого)
select * from Employees where  day(dateCome)=1
--Таблица Employees. Получить список всех сотрудников пришедших на работу в 2008 году
select * from Employees where  year(dateCome)=2008
--Таблица DUAL. Показать завтрашнюю дату в формате: Tomorrow is Second day of January

select concat('Tomorrow is ',date_format(date_add(now(), interval 1 day),'%d') , ' day of ',date_format(date_add(now(), interval 1 day),'%M')) as text
from DUAL
--Таблица Employees. Получить список всех сотрудников и дату прихода на работу каждого в формате: 21st of June, 2007
select StaffName, format(dateCome,"%D of %M, %Y") from Employees
--Таблица Employees. Получить список всех сотрудников, которые пришили на работу в феврале 2007 года.
select * from Employees where  year(dateCome)=2008 and month(dateCome)=2



--Таблица Employees. Получить репорта по department_id с минимальной и
 --максимальной зарплатой, с ранней и поздней датой прихода на работу и с 
 --количеством сотрудников. Сорировать по количеству сотрудников (по убывающей)

 select department_id , max(salary), min(salary),