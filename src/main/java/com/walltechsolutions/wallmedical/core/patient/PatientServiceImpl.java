package com.walltechsolutions.wallmedical.core.patient;

import com.walltechsolutions.wallmedical.core.representationmodels.PatientRepresentation;
import com.walltechsolutions.wallmedical.data.models.Patient;
import com.walltechsolutions.wallmedical.data.repositories.PatientRepository;
import com.walltechsolutions.wallmedical.helpers.exceptions.PatientNotFoundException;
import org.dozer.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {

    private final Mapper mapper;
    private final PatientRepository patientRepository;

    public PatientServiceImpl(
            Mapper mapper,
            PatientRepository patientRepository
    ) {
        this.mapper = mapper;
        this.patientRepository = patientRepository;
    }

    @Override
    public long create(Patient patient) {
        return this.patientRepository.save(patient).getId();
    }

    @Override
    public Page<PatientRepresentation> findAll(Pageable pageable) {
        return this.patientRepository
                .findAll(pageable)
                .map(patient -> this.mapper
                    .map(patient, PatientRepresentation.class));
    }

    @Override
    public PatientRepresentation findById(long id) {
        Patient patient = this.exists(id);
        return this.mapper.map(patient, PatientRepresentation.class);
    }

    @Override
    public void partialUpdate(long id, Patient patient) {

        Patient currentPatient = this.exists(id);
        this.mapper.map(patient, currentPatient, "patient-non-null");

        this.patientRepository.save(currentPatient);
    }

    @Override
    public void update(long id, Patient patient) {
        Patient currentPatient = this.exists(id);
        this.mapper.map(patient, currentPatient);

        this.patientRepository.save(currentPatient);
    }

    @Override
    public void remove(long id) {

        Patient product = this.exists(id);

        this.patientRepository.save(product);
    }

    @Override
    public Patient exists(long id) {
        return this.patientRepository.findById(id)
                .orElseThrow(() -> new PatientNotFoundException(id));
    }
}
