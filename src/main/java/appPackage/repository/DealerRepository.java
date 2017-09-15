package appPackage.repository;

import appPackage.model.Dealer;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DealerRepository extends CrudRepository<Dealer,Long>{
    List<Dealer> findAll();
    Dealer findDealerByLogin(String login);
}
