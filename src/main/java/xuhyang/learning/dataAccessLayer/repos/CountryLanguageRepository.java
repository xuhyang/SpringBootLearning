package xuhyang.learning.dataAccessLayer.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xuhyang.learning.dataAccessLayer.entities.CountryLanguage;
import xuhyang.learning.dataAccessLayer.entities.CountryLanguagePK;

/**
 * Created by admin on 7/24/2016.
 */

@Repository
public interface CountryLanguageRepository extends CrudRepository<CountryLanguage, CountryLanguagePK> {

}
