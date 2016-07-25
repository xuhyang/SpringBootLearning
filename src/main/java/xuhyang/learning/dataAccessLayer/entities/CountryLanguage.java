package xuhyang.learning.dataAccessLayer.entities;

import javax.persistence.*;

/**
 * CountryCode char(3) PK
 Language char(30) sOfficial enum('T','F')
 Percentage float(4,1)
 */

@Entity @Table(name="countryLanguage")
@IdClass(CountryLanguagePK.class)
public class CountryLanguage {

    @Id
    @Column(name = "CountryCode", insertable=false, updatable=false)
    private String countryCode;
    @Id
    @Column(name = "Language")
    private String language;
    @Column(name = "IsOfficial")
    private Boolean isOfficial;
    @Column(name = "percentage")
    private Float percentage;

    @JoinColumn(name = "CountryCode", referencedColumnName = "Code")
    @ManyToOne
    private Country country;


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
