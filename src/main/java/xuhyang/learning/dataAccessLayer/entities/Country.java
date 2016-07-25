package xuhyang.learning.dataAccessLayer.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.corba.se.spi.activation.ServerOperations;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Code char(3) PK
 Name char(52)
 Continent enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America')
 Region char(26)
 SurfaceArea float(10,2)
 IndepYear smallint(6)
 Population int(11)
 LifeExpectancy float(3,1)
 GNP float(10,2)
 GNPOld float(10,2)
 LocalName char(45)
 GovernmentForm char(45)
 HeadOfState char(60)
 Capital int(11)
 Code2 char(2)
 */

@Entity @Table(name="country")
public class Country implements Serializable {

    @Id
    @Column(name="Code")
    private String code;

    @Column(name="Name")
    private String name;

    @Column(name="Region")
    private String region;

    @Column(name="surface_area")
    private Float surfaceArea;

    @Column(name="indep_year")
    private Integer indepYear;

    @Column(name="Population")
    private Integer population;

    @Column(name="life_expectancy")
    private Float lifeExpectancy;

    @Column(name="GNP")
    private Float GNP;

    @Column(name="GNPOld")
    private Float GNPOld;

    @Column(name="local_name")
    private String localName;

    @Column(name="government_form")
    private String governmentForm;

    @Column(name="head_of_state")
    private String headOfState;

    @Column(name="Capital")
    private Integer capital;

    @Column(name="Code2")
    private String code2;

    @JsonIgnore
    @OneToMany(mappedBy = "country", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Set<City> cities = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "country", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Set<CountryLanguage> languages = new HashSet<>();


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Float getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(Float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Float getGNP() {
        return GNP;
    }

    public void setGNP(Float GNP) {
        this.GNP = GNP;
    }

    public Float getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(Float GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (code != null ? !code.equals(country.code) : country.code != null) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;
        if (region != null ? !region.equals(country.region) : country.region != null) return false;
        if (surfaceArea != null ? !surfaceArea.equals(country.surfaceArea) : country.surfaceArea != null) return false;
        if (indepYear != null ? !indepYear.equals(country.indepYear) : country.indepYear != null) return false;
        if (population != null ? !population.equals(country.population) : country.population != null) return false;
        if (lifeExpectancy != null ? !lifeExpectancy.equals(country.lifeExpectancy) : country.lifeExpectancy != null)
            return false;
        if (GNP != null ? !GNP.equals(country.GNP) : country.GNP != null) return false;
        if (GNPOld != null ? !GNPOld.equals(country.GNPOld) : country.GNPOld != null) return false;
        if (localName != null ? !localName.equals(country.localName) : country.localName != null) return false;
        if (governmentForm != null ? !governmentForm.equals(country.governmentForm) : country.governmentForm != null)
            return false;
        if (headOfState != null ? !headOfState.equals(country.headOfState) : country.headOfState != null) return false;
        if (capital != null ? !capital.equals(country.capital) : country.capital != null) return false;
        if (code2 != null ? !code2.equals(country.code2) : country.code2 != null) return false;
        if (cities != null ? !cities.equals(country.cities) : country.cities != null) return false;
        return languages != null ? languages.equals(country.languages) : country.languages == null;

    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (surfaceArea != null ? surfaceArea.hashCode() : 0);
        result = 31 * result + (indepYear != null ? indepYear.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + (lifeExpectancy != null ? lifeExpectancy.hashCode() : 0);
        result = 31 * result + (GNP != null ? GNP.hashCode() : 0);
        result = 31 * result + (GNPOld != null ? GNPOld.hashCode() : 0);
        result = 31 * result + (localName != null ? localName.hashCode() : 0);
        result = 31 * result + (governmentForm != null ? governmentForm.hashCode() : 0);
        result = 31 * result + (headOfState != null ? headOfState.hashCode() : 0);
        result = 31 * result + (capital != null ? capital.hashCode() : 0);
        result = 31 * result + (code2 != null ? code2.hashCode() : 0);
        result = 31 * result + (cities != null ? cities.hashCode() : 0);
        result = 31 * result + (languages != null ? languages.hashCode() : 0);
        return result;
    }
}
