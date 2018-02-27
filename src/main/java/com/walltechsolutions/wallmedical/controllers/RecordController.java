package com.walltechsolutions.wallmedical.controllers;

import com.walltechsolutions.wallmedical.core.record.RecordService;
import com.walltechsolutions.wallmedical.core.representationmodels.RecordRepresentation;
import com.walltechsolutions.wallmedical.data.models.Record;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/records")
public class RecordController {

    private final RecordService recordService;

    public RecordController(
            RecordService recordService
    ) {
        this.recordService = recordService;
    }

    public Page<RecordRepresentation> records(Pageable pageable) {
        return this.recordService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public RecordRepresentation patient(@PathVariable long id) {
        return this.recordService.findById(id);
    }
}
