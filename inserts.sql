INSERT INTO medicos (apellido_materno, apellido_paterno, nombre, especialidad) VALUES ('DURAN', 'LOPEZ', 'DANIEL', 'CIRUGIA PLASTICA');
INSERT INTO medicos (apellido_materno, apellido_paterno, nombre, especialidad) VALUES ('MARTINEZ', 'URIBE', 'EMMANUEL', 'ODONTOLOGÍA');
INSERT INTO medicos (apellido_materno, apellido_paterno, nombre, especialidad) VALUES ('VAZQUEZ', 'HERNANDEZ', 'CESAR', 'ANGIOLOGO');
INSERT INTO medicos (apellido_materno, apellido_paterno, nombre, especialidad) VALUES ('MANRIQUEZ', 'PACHECO', 'CESAR', 'TRAUMATOLOGO');
INSERT INTO medicos (apellido_materno, apellido_paterno, nombre, especialidad) VALUES ('PADRON', 'RANGEL', 'CLAUDIA', 'PEDIATRA');
INSERT INTO medicos (apellido_materno, apellido_paterno, nombre, especialidad) VALUES ('MARTINEZ', 'ARRELOA', 'MARIELA', 'NUTRILOGO');

INSERT INTO consultorios (id, piso) VALUES (1,3);
INSERT INTO consultorios (id, piso) VALUES (2,2);
INSERT INTO consultorios (id, piso) VALUES (3,4);
INSERT INTO consultorios (id, piso) VALUES (4,1);



INSERT INTO citas (id_consultorio, id_medico, hora_consulta, paciente) VALUES (1, 1, "13:00", "Sergio Ruiz");
INSERT INTO citas (id_consultorio, id_medico, hora_consulta, paciente) VALUES (2, 2, "15:00", "Hector Suarez");
INSERT INTO citas (id_consultorio, id_medico, hora_consulta, paciente) VALUES (1, 4, "18:00", "Fátima Torres");
INSERT INTO citas (id_consultorio, id_medico, hora_consulta, paciente) VALUES (3, 5, "12:00", "Jafeth Contreras");
INSERT INTO citas (id_consultorio, id_medico, hora_consulta, paciente) VALUES (4, 6, "10:00", "Miguel Barrera");
INSERT INTO citas (id_consultorio, id_medico, hora_consulta, paciente) VALUES (2, 3, "14:00", "Alberto Cruz");