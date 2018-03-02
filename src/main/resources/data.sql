INSERT person(identification_number, name, middle_name, last_name) VALUES ('1804-1997-07040', 'Paciente 1', '', 'Escalon');
SET @id = LAST_INSERT_ID();
SET @patient1 = LAST_INSERT_ID();
INSERT INTO patient(id) VALUES (@id);

INSERT person(identification_number, name, middle_name, last_name) VALUES ('1804-1997-4545', 'Paciente 2', '', 'Fernandez');
SET @id = LAST_INSERT_ID();
INSERT INTO patient(id) VALUES (@id);

INSERT INTO record(medical_history, patient_id) VALUES ('Padecimientos previos: Sinusitis', @patient1);
SET @recordid =  LAST_INSERT_ID();

INSERT INTO record_detail(diagnosis, treatment, record_id) VALUES ('Estrés', 'Dieta y ejercicio', @recordid);