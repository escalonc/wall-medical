package com.walltechsolutions.wallmedical.core.record;

import com.walltechsolutions.wallmedical.core.representationmodels.RecordRepresentation;
import com.walltechsolutions.wallmedical.data.models.Record;
import com.walltechsolutions.wallmedical.data.repositories.RecordRepository;
import com.walltechsolutions.wallmedical.helpers.exceptions.RecordNotFoundException;
import org.dozer.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class RecordServiceImpl implements RecordService {

    private final Mapper mapper;
    private final RecordRepository recordRepository;

    public RecordServiceImpl(
            Mapper mapper,
            RecordRepository recordRepository
    ) {
        this.mapper = mapper;
        this.recordRepository = recordRepository;
    }

    @Override
    public long create(Record record) {
        return this.recordRepository.save(record).getId();
    }

    @Override
    public Page<RecordRepresentation> findAll(Pageable pageable) {
        return this.recordRepository
                .findAll(pageable)
                .map(patient -> this.mapper
                        .map(patient, RecordRepresentation.class));
    }

    @Override
    public RecordRepresentation findById(long id) {
        Record patient = this.exists(id);
        return this.mapper.map(patient, RecordRepresentation.class);
    }

    @Override
    public void partialUpdate(long id, Record record) {

    }

    @Override
    public void update(long id, Record record) {

    }

    @Override
    public void remove(long id) {

    }

    @Override
    public Record exists(long id) {
        return this.recordRepository.findById(id)
                .orElseThrow(() -> new RecordNotFoundException(id));
    }
}
