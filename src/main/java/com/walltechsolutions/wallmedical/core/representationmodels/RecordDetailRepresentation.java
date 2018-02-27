package com.walltechsolutions.wallmedical.core.representationmodels;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.time.ZonedDateTime;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RecordDetailRepresentation {

    private long id;

    private String diagnosis;
    private String treatment;

    private ZonedDateTime date;

    @JsonIgnore
    private RecordRepresentation record;
}
