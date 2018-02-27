package com.walltechsolutions.wallmedical.core.product;

import com.walltechsolutions.wallmedical.core.common.CommonService;
import com.walltechsolutions.wallmedical.core.representationmodels.PatientRepresentation;
import com.walltechsolutions.wallmedical.data.models.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PatientService extends CommonService<Patient, PatientRepresentation> {
}
