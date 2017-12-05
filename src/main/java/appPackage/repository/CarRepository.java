package appPackage.repository;

import appPackage.model.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findAll();

    @Query("select c from Car c where c.user.id = :id")
    List<Car> findCarsByDealerId(@Param("id") Long id);

    @Query("select c from Car c where c.user is null")
    List<Car> findCarsWithoutDealer();
}
