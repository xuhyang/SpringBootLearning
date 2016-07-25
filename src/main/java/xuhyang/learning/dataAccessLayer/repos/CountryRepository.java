package xuhyang.learning.dataAccessLayer.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xuhyang.learning.dataAccessLayer.entities.Country;

/**
 * Created by admin on 7/24/2016.
 */


public interface CountryRepository extends CrudRepository<Country, String> {


}
