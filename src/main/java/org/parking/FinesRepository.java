package org.parking;

import org.springframework.data.repository.CrudRepository;

public interface FinesRepository extends CrudRepository<FineRedisEntity,Long> {

}
