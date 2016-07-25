package xuhyang.learning.dataAccessLayer.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xuhyang.learning.dataAccessLayer.entities.City;

/**
 * Created by admin on 7/24/2016.
 */
@Repository
public interface CityRepository extends CrudRepository<City, Integer>{
}
