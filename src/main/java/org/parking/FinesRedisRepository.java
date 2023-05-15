package org.parking;

import org.springframework.data.repository.CrudRepository;

public interface FinesRedisRepository extends CrudRepository<FineRedisEntity,Long> {

}
