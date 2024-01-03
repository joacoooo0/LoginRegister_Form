CREATE DATABASE LoginRegister;

CREATE TABLE USUARIOS (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (255),
    apellido VARCHAR (255),
    correo VARCHAR (200),
    pass VARCHAR (50),
    fechareg DATE
);