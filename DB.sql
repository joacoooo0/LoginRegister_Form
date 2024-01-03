CREATE DATABASE LoginRegister;

USE LoginRegister;

CREATE TABLE USUARIOS (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR (255),
    apellido VARCHAR (255),
    correo VARCHAR (200),
    pass VARCHAR (50),
    fechareg DATE,
    idTipo INT,
    FOREIGN KEY (idTipo) REFERENCES TIPO_USUARIOS (idTipo)
);

CREATE TABLE TIPO_USUARIOS(
	idTipo INT AUTO_INCREMENT PRIMARY KEY,
    nombreTipo VARCHAR (100)
);

INSERT INTO TIPO_USUARIOS (nombreTipo)
VALUES ('Administrador'), ('Empleado'), ('Contador'), ('Limpieza'), ('Secretario/a'), ('CEO');

INSERT INTO USUARIOS (nombre, apellido, correo, pass, fechareg, idTipo)
VALUES ('Jesus', 'Ibañez', 'correo1@gmail.com', 'pass1', '2024-01-01', 1);

SELECT * FROM TIPO_USUARIOS;
SELECT * FROM USUARIOS;