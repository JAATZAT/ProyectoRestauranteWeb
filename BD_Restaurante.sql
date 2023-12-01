create database sistemaRestaurante;
	use sistemaRestaurante;

CREATE TABLE tb_enlace (
  idenlace int NOT NULL AUTO_INCREMENT,
  descripcion varchar(60) DEFAULT NULL,
  ruta varchar(60) DEFAULT NULL,
  PRIMARY KEY (idenlace)
);

INSERT INTO tb_enlace VALUES (1,'Registrar Servicio','/crearServicio'),
							 (2,'Ver Mis Servicios','/listaServicio'),
							 (3,'Ver Usuarios','/listaUsuario'),
							 (4,'Reservar Corte De Cabello','/crearReserva'),
							 (5,'Ver Mis Reservas','/listaReserva'),
							 (6,'Ver Mis Pagos','/listaPagoUsuario'),
							 (7,'Ver Mis Comentarios','/listaComentario'),
							 (8,'Ver lista De Pagos De Usuarios','/listaPago');

CREATE TABLE tb_rol (
  idrol int NOT NULL AUTO_INCREMENT,
  descripcion varchar(60) DEFAULT NULL,
  PRIMARY KEY (idrol)
);

INSERT INTO tb_rol VALUES (1,'Administrador'),
                          (2,'Usuario'),
                          (3,'Recepcionista');

CREATE TABLE tb_rol_enlace(
  idrol int NOT NULL,
  idenlace int NOT NULL,
  PRIMARY KEY(idrol,idenlace),
  CONSTRAINT fk24 FOREIGN KEY (idrol) REFERENCES tb_rol(idrol),
  CONSTRAINT fk25 FOREIGN KEY (idenlace) REFERENCES tb_enlace(idenlace)
);

INSERT INTO tb_rol_enlace VALUES (1,1),
								 (1,2),
								 (1,3),
								 (2,4),
								 (2,5),
                                 (2,6),
                                 (2,7),
                                 (3,8);

CREATE TABLE tb_usuario(
  cod_usu int NOT NULL auto_increment,
  nombre varchar(60) DEFAULT NULL,
  apellido varchar(60) DEFAULT NULL,
  email varchar(60) DEFAULT NULL,
  contra varchar(60) DEFAULT NULL,
  idrol int DEFAULT NULL,
  eliminado char(2),
  PRIMARY KEY (cod_usu),
  FOREIGN KEY (idrol) REFERENCES tb_rol(idrol)
);
INSERT INTO tb_usuario VALUES(1,"admin","apellido admin","admin@gmail.com","$2a$10$Bg7DE7cIaTvXBsBTZxFfHe0atgPe0V5UvY3ItCCdkJrkq2IpwPT8a",1,"no");
INSERT INTO tb_usuario VALUES(2,"richard","fuentes","richard@gmail.com","$2a$10$Bg7DE7cIaTvXBsBTZxFfHe0atgPe0V5UvY3ItCCdkJrkq2IpwPT8a",2,"no");
INSERT INTO tb_usuario VALUES(3,"jose","apaza","jose@gmail.com","$2a$10$Bg7DE7cIaTvXBsBTZxFfHe0atgPe0V5UvY3ItCCdkJrkq2IpwPT8a",2,"no");
INSERT INTO tb_usuario VALUES(4,"sahimer","Llacze","sahimer@gmail.com","$2a$10$Bg7DE7cIaTvXBsBTZxFfHe0atgPe0V5UvY3ItCCdkJrkq2IpwPT8a",2,"no");
INSERT INTO tb_usuario VALUES(5,"julio","rodriguez","julio@gmail.com","$2a$10$Bg7DE7cIaTvXBsBTZxFfHe0atgPe0V5UvY3ItCCdkJrkq2IpwPT8a",2,"no");

select * from tb_usuario;

create table servicio
(
id int primary key auto_increment,
nombre varchar(50),
precio decimal(10,2),
imagen varchar(25),
cod_usu int,
eliminado char(2),
foreign key(cod_usu) references tb_usuario(cod_usu)
);

INSERT INTO servicio VALUES(1,"Aji de Gallina",12,"aji d gallina.jpg",1,"no");
INSERT INTO servicio VALUES(2,"Ceviche",18,"arroz con pollo.jpg",1,"no");
INSERT INTO servicio VALUES(3,"Arroz con Pollo",12,"causa.jpg",1,"no");
INSERT INTO servicio VALUES(4,"Chaufa",08,"ceviche.jpg",1,"no");
INSERT INTO servicio VALUES(5,"Causa",10,"chaufa.jpg",1,"no");
INSERT INTO servicio VALUES(6,"Pachamanca",20,"lomo saltado.jpg",1,"no");
INSERT INTO servicio VALUES(7,"Tallarines rojos",08,"pachamanca.jpg",1,"no");
INSERT INTO servicio VALUES(8,"Pollo a la brasa",21,"pollo a la brasa.jpg",1,"no");
INSERT INTO servicio VALUES(9,"Lomo saltado",15,"tallarines rojos.jpg",1,"no");

select * from servicio;

create table reserva
(
idreserva int primary key auto_increment,
descripcion varchar(100),
fecha date,
hora time,
cod_usu int,
idservicio int,
eliminado char(2),
foreign key(cod_usu) references tb_usuario(cod_usu),
foreign key(idservicio) references servicio(id)
);

create table pago
(
id int primary key auto_increment,
importe decimal(10,2),
fecha date,
hora time,
idusuario int,
idreserva int,
tipo varchar(25),
foreign key(idusuario) references tb_usuario(cod_usu),
foreign key(idreserva) references reserva(idreserva)
);

create table comentario
(
id int primary key auto_increment,
comentario text,
fecha date,
hora time,
idusuario int,
idservicio int,
foreign key(idusuario) references tb_usuario(cod_usu),
foreign key(idservicio) references servicio(id)
);