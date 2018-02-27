package com.walltechsolutions.wallmedical.controllers;

import com.walltechsolutions.wallmedical.core.product.PatientService;
import com.walltechsolutions.wallmedical.core.representationmodels.PatientRepresentation;
import com.walltechsolutions.wallmedical.data.models.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(
            PatientService patientService
    ) {
        this.patientService = patientService;
    }

    @GetMapping
    public Page<PatientRepresentation> patients(Pageable pageable) {
        return this.patientService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public PatientRepresentation patient(@PathVariable long id) {
        return this.patientService.findById(id);
    }

    @PostMapping
    public ResponseEntity<?> add(@Valid @RequestBody Patient patient) {
        long id = this.patientService.create(patient);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(id).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable long id, @Valid @RequestBody Patient patient)
    {
        this.patientService.update(id, patient);

        return ResponseEntity.ok().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> partialUpdate(@PathVariable long id, @Valid @RequestBody Patient patient) {

        this.patientService.partialUpdate(id, patient);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {

        this.patientService.remove(id);

        return ResponseEntity.ok().build();
    }
}
