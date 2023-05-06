package org.parking;

import org.springframework.data.repository.CrudRepository;

public interface CarsOnParkingRepository extends CrudRepository<CarRedisEntity, Long> {

}
