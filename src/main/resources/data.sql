--Инициализация тестовых данных

insert into men(ID, FIRST_NAME, VERSION) values(1, 'Иван', 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(1, 'Петров', 1, 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(2, 'Сидоров', 1, 1);


insert into men(ID, FIRST_NAME, VERSION) values(2, 'Александр',1 );
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(3, 'Петров', 2, 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(4, 'Сидоров', 2, 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(5, 'попов', 2, 1);

insert into men(ID, FIRST_NAME, VERSION) values(-3, 'Семен', 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(6, 'Петров', 2, 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(7, 'Сидоров', 2, 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(8, 'Путин', 2, 1);

insert into men(ID, FIRST_NAME, VERSION) values(-4, 'Виктор', 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(9, 'Петров', 2, 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(10, 'Сидоров', 2, 1);
insert into lastname(ID, TEXT, MAN_ID, VERSION) values(11, 'Зеленский', 2, 1);
