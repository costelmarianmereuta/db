insert into role (id, role) values(1, 'Admin')
insert into role (id, role) values(2, 'User')
insert into role (id, role) values(3, 'Gestionnaire')

insert into telephone (id, marque, model) values(1, 'iphone','10')
insert into telephone (id, marque, model) values(2, 'samsung','s10')
insert into telephone (id, marque, model) values(3, 'oneplus','6t')
insert into telephone (id, marque, model) values(4, 'hawaii','c9')

insert into users (id, nom, prenom, mail,telephone_id) values(1, 'mereuta','marian','marian@gmail.com',3)
insert into users (id, nom, prenom, mail,telephone_id) values(2, 'bozga','adi','adi@gmail.com',3)
insert into users (id, nom, prenom, mail,telephone_id) values(3, 'rusu','bogdan','rusu@gmail.com',1)
insert into users (id, nom, prenom, mail,telephone_id) values(4, 'tatar','dan','dan@gmail.com',3)


insert into user_has_role (user_id, role_id) values(1,1)
insert into user_has_role (user_id, role_id) values(2,1)
insert into user_has_role (user_id, role_id) values(1,2)
insert into user_has_role (user_id, role_id) values(1,3)
insert into user_has_role (user_id, role_id) values(3,3)
insert into user_has_role (user_id, role_id) values(4,3)