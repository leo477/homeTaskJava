--Даны две таблицы: таблица category с полями id и name и таблица page с полями id, name и category_id. Достаньте одним запросом все страницы вместе с их категориями.
select page.*, category.* from page left join category on category.id = page.category_id


--Даны 3 таблицы: таблица category с полями id и name, таблица sub_category с полями id и name и таблица page с полями id, name и sub_category_id. Достаньте одним запросом все страницы вместе с их подкатегориями и категориями. 
select * from (page left join category on category.id=page.category_id)
left join sub_category on page.sub_category_id=sub_category.id

--Вывести отсортированный по количеству поездок (по убыванию) и имени (по возрастанию) список пассажиров, совершивших хотя бы 1 переезд.
SELECT name, COUNT(trip) as count from Passenger p left JOIN Pass_in_trip pt ON p.id=pt.passenger left JOIN 
Trip t on t.id=pt.trip
group by name HAVING count>0
order by count desc, name asc