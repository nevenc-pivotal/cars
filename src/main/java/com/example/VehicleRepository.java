package com.example;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * VehicleRepository restful repository
 *
 * @author @nevenc
 *
 */
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
}
