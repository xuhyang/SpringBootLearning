package xuhyang.learning.dataAccessLayer.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

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
public class Country {

    private String code;

    private String name;

    private String region;

    private Float surfaceArea;

    private Integer indepYear;

    private Integer population;

    private Float lifeExpectancy;

    private Float GNP;

    private Float GNPOld;

    private String localName;

    private String governmentForm;

    private String headOfState;

    private Integer capital;

    private String code2;


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
}
