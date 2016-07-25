package xuhyang.learning.businessLayer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xuhyang.learning.dataAccessLayer.entities.Country;
import xuhyang.learning.dataAccessLayer.repos.CountryRepository;

/**
 * Created by admin on 7/24/2016.
 */

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public Iterable<Country> getAll() {
        return countryRepository.findAll();
    }

    public Country getCountryByCode(String code) {
        return  countryRepository.findOne(code);
    }

    public void add(Country country) {
        countryRepository.save(country);
    }

    public void update(Country country) {
        if (countryRepository.findOne(country.getCode()) != null)
            countryRepository.save(country);
    }

    public void deleteCountryByCode(String code) {
        countryRepository.delete(code);
    }

}
