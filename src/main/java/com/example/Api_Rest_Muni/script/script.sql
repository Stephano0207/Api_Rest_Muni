insert into rol(nombre)
 values
('Alcalde'),
('Secretaria'),
('Empleado');

insert into usuario(email,password, fk_usuario)
values('alcalde@gmail.com','alcalde123',1),
('secretari@gmail.com','secretaria123',2),
('empleado@gmail.com','empleado123',3);
