package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Vehicle entity
 *
 * @author @nevenc
 */
@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    private Long id;

    private String vin;
    private String make;
    private String model;
    private int year;
    private String trim;
    private String engine;

    public Vehicle() {
    }

    public Vehicle(String vin, String make, String model, int year, String trim, String engine) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
        this.trim = trim;
        this.engine = engine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "id=" + id + ", vin='" + vin + '\'' + '}';
    }

}
