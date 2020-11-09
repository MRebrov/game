delete from "order_items";
delete from "order";
delete from "user";
delete from item;


insert into "user"
values 
	(1, 'Ivan', 20),
	(2, 'Anton', 22),
	(3, 'Larisa', 46),
	(4, 'Marina', 28),
	(5, 'Viktor', 35),
	(6, 'Anna', 23);

select * from "user";


insert into item
values 
	(1, 'WarCraft III', 49.99),
	(2, 'Fallout 2', 99.99),
	(3, 'Counter-Strike 1.6', 149.99),
	(4, 'God of War', 199.99),
	(5, 'inFamous', 69.99),
	(6, 'Need for speed', 49.99),
	(7, 'Heroes of Might and Magic', 59.99),
	(8, 'The Witcher', 79.99),
	(9, 'Quake', 29.99),
	(10, 'Battlefield', 24.99);

select * 
from item;


insert into "order"
values 
	(1, 6, 'Pushkina, 4'),
	(2, 3, 'Kolotushkina, 2');

select * 
from "order";


insert into "order_items"
values 
	(1, 4),
	(1, 3),
	(2, 8),
	(2, 4);

select * 
from "order_items";