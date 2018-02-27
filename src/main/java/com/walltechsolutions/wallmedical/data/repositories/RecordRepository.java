package com.walltechsolutions.wallmedical.data.repositories;

import com.walltechsolutions.wallmedical.data.models.Record;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordRepository extends BaseRepository<Record, Long> {
}
