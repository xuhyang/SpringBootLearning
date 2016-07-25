package xuhyang.learning.dataAccessLayer.entities;

import javax.persistence.*;
import java.io.Serializable;

/**
 * ID int(11) AI PK
 Name char(35)
 CountryCode char(3)
 District char(20)
 Population int(11)
 */

@Entity @Table(name = "city")
public class City implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String name;

    @Column(name = "District")
    private String district;

    @Column(name = "CountryCode", insertable=false, updatable=false)
    private String countryCode;

    @Column(name = "Population")
    private Integer population;

    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    @ManyToOne
    private Country country;


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

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (id != null ? !id.equals(city.id) : city.id != null) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        if (district != null ? !district.equals(city.district) : city.district != null) return false;
        if (countryCode != null ? !countryCode.equals(city.countryCode) : city.countryCode != null) return false;
        if (population != null ? !population.equals(city.population) : city.population != null) return false;
        return country != null ? country.equals(city.country) : city.country == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
