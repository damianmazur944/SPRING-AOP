package appPackage.controller;

import appPackage.Aspects.TimeMessure;
import appPackage.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import appPackage.repository.CarRepository;
import appPackage.repository.DealerRepository;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarRepository carRepository;
    private final DealerRepository dealerRepository;

    @Autowired
    CarController(CarRepository carRepository,
                  DealerRepository dealerRepository){
        this.carRepository = carRepository;
        this.dealerRepository = dealerRepository;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    Car getCar(@PathVariable Long id){
        return this.carRepository.findOne(id);
    }
    @TimeMessure
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    List<Car> getAllCars(){
        return this.carRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    void addCar(@RequestBody Car car){
        this.carRepository.save(car);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/deleteCar/{id}")
    void deleteCar(@PathVariable Long id){
        this.carRepository.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET,value="/getDealerCars/{dealerId}")
    @ResponseBody
    List<Car> getCarsByDealerId(@PathVariable Long dealerId){
        return this.carRepository.findCarsByDealerId(dealerId);
    }

}
