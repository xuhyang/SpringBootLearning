package xuhyang.learning.dataAccessLayer.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CountryCode char(3) PK
 Language char(30) sOfficial enum('T','F')
 Percentage float(4,1)
 */

@Entity @Table(name="countryLanguage")
public class CountryLanguage {

    private String countryCode;

    private String language;

    private Boolean isOfficial;

    private Float percentage;


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getOfficial() {
        return isOfficial;
    }

    public void setOfficial(Boolean official) {
        isOfficial = official;
    }

    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}
