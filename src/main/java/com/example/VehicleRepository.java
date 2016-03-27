package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * VehicleRepository restful repository
 *
 * @author @nevenc
 *
 */
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
    public Vehicle findByVin(@Param("vin") String vin);
}
