package xuhyang.learning.presentationLayer.controllers;

/**
 * Created by admin on 7/24/2016.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xuhyang.learning.businessLayer.services.CountryService;
import xuhyang.learning.dataAccessLayer.entities.Country;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Country> getCountries() {
        return  countryService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    public void addCountry(@RequestBody Country country) {
        countryService.add(country);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.DELETE)
    public void deleteCountryByCode(@PathVariable("id") String id) {
        countryService.deleteCountryByCode(id);
    }

    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Country getCountryByCode(@PathVariable("id") String id) {
        System.out.println(id);
        return countryService.getCountryByCode(id);
    }

    @RequestMapping(method=RequestMethod.PUT, consumes="application/json")
    public void updatePerson(@RequestBody Country country) {
        countryService.update(country);
    }


}
