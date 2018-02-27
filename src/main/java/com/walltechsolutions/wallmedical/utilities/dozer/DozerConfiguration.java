package com.walltechsolutions.wallmedical.utilities.dozer;

import org.dozer.CustomFieldMapper;
import org.dozer.DozerBeanMapperBuilder;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfiguration {

    private final CustomFieldMapper lazyFieldMapper;

    @Autowired
    public DozerConfiguration(CustomFieldMapper lazyFieldMapper) {
        this.lazyFieldMapper = lazyFieldMapper;
    }

    @Bean(name = "org.dozer.Mapper")
    public Mapper dozerBean() {

        return DozerBeanMapperBuilder
                .create()
                .withCustomFieldMapper(lazyFieldMapper)
                .withMappingFiles("dozer-mappings.xml")
                .build();
    }
}