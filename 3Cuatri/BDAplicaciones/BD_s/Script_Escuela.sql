-- Crear una base de datos
CREATE DATABASE Escuela;

-- Usar la base de datos creada
USE Escuela;

-- Crear tabla de Alumnos
CREATE TABLE Alumnos (
  id INT PRIMARY KEY,
  nombre VARCHAR(50),
  edad INT,
  grado VARCHAR(20),
  direccion VARCHAR(100),
  email VARCHAR(100)
);

-- Crear tabla de Profesores
CREATE TABLE Profesores (
  id INT PRIMARY KEY,
  nombre VARCHAR(50),
  especialidad VARCHAR(50),
  email VARCHAR(100)
);

-- Crear tabla de Cursos
CREATE TABLE Cursos (
  id INT PRIMARY KEY,
  nombre VARCHAR(50),
  descripcion VARCHAR(100),
  profesor_id INT,
  FOREIGN KEY (profesor_id) REFERENCES Profesores(id)
);

-- Crear tabla de Notas
CREATE TABLE Notas (
  id INT PRIMARY KEY,
  alumno_id INT,
  curso_id INT,
  calificacion FLOAT,
  FOREIGN KEY (alumno_id) REFERENCES Alumnos(id),
  FOREIGN KEY (curso_id) REFERENCES Cursos(id)
);

-- Insertar datos de ejemplo en la tabla Alumnos
INSERT INTO Alumnos (id, nombre, edad, grado, direccion, email)
VALUES
  (1, 'Juan P�rez', 15, '9� grado', 'Calle 123, Ciudad', 'juan@example.com'),
  (2, 'Mar�a L�pez', 16, '10� grado', 'Avenida XYZ, Ciudad', 'maria@example.com');

-- Insertar datos de ejemplo en la tabla Profesores
INSERT INTO Profesores (id, nombre, especialidad, email)
VALUES
  (1, 'Pedro G�mez', 'Matem�ticas', 'pedro@example.com'),
  (2, 'Ana Rodr�guez', 'Historia', 'ana@example.com');

-- Insertar datos de ejemplo en la tabla Cursos
INSERT INTO Cursos (id, nombre, descripcion, profesor_id)
VALUES
  (1, 'Matem�ticas 101', 'Introducci�n a las matem�ticas', 1),
  (2, 'Historia del Mundo', 'Un recorrido por la historia mundial', 2);

-- Insertar datos de ejemplo en la tabla Notas
INSERT INTO Notas (id, alumno_id, curso_id, calificacion)
VALUES
  (1, 1, 1, 8.5),
  (2, 1, 2, 9.2),
  (3, 2, 1, 7.8);
