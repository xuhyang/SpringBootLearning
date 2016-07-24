package xuhyang.learning.dataAccessLayer.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 7/24/2016.
 */

@Entity @Table(name = "city")
public class City {

    private Integer id;

    private String name;

    private String district;

    private String countryCode;

    private Integer population;


    public City() {}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

}
