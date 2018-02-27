package com.walltechsolutions.wallmedical.core.record;

import com.walltechsolutions.wallmedical.core.common.CommonService;
import com.walltechsolutions.wallmedical.core.representationmodels.RecordRepresentation;
import com.walltechsolutions.wallmedical.data.models.Record;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

public interface RecordService extends CommonService<Record, RecordRepresentation> {
}
