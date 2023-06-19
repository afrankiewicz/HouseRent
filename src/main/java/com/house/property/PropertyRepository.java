package com.house.property;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PropertyRepository extends CrudRepository<PropertyModel, Long> {

    @Override
    Optional<PropertyModel> findById(Long id);
}
