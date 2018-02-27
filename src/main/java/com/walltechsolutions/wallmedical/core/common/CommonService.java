package com.walltechsolutions.wallmedical.core.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommonService<TEntity, TRepresentation> {

    long create(TEntity entity);
    Page<TRepresentation> findAll(Pageable pageable);
    TRepresentation findById(long id);
    void partialUpdate(long id, TEntity entity);
    void update(long id, TEntity entity);
    void remove(long id);
    TEntity exists(long id);
}
