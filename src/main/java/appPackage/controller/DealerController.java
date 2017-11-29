package appPackage.controller;

import appPackage.Aspects.TimeMessure;
import appPackage.model.Car;
import appPackage.model.Dealer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import appPackage.repository.CarRepository;
import appPackage.repository.DealerRepository;
import appPackage.repository.RoleRepository;

import java.util.List;

@RestController
@RequestMapping("/dealers")
public class DealerController {

    private DealerRepository dealerRepository;
    private RoleRepository roleRepository;
    private CarRepository carRepository;

    @Autowired
    public DealerController(DealerRepository dealerRepository,
                            RoleRepository roleRepository,
                            CarRepository carRepository){
        this.carRepository = carRepository;
        this.roleRepository = roleRepository;
        this.dealerRepository = dealerRepository;
    }
    @TimeMessure
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    List<Dealer> getAllDealers(){
        return this.dealerRepository.findAll();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    @ResponseBody
    Dealer getDealer(@PathVariable Long id){
        return this.dealerRepository.findOne(id);
    }

    void addDealer(@RequestBody Dealer dealer){
        this.dealerRepository.save(dealer);
    }

}
