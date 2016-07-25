package xuhyang.learning.dataAccessLayer.entities;

import java.io.Serializable;
import java.io.StreamCorruptedException;

/**
 * Created by admin on 7/24/2016.
 */
public class CountryLanguagePK implements Serializable {

    private String countryCode;

    private String language;


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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryLanguagePK that = (CountryLanguagePK) o;

        if (!countryCode.equals(that.countryCode)) return false;
        return language.equals(that.language);
    }

    @Override
    public int hashCode() {
        int result = countryCode.hashCode();
        result = 31 * result + language.hashCode();
        return result;
    }
}
