package appPackage.controller;

import appPackage.Aspects.TimeMessure;
import appPackage.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import appPackage.repository.CarRepository;
import appPackage.repository.UserRepository;
import appPackage.repository.RoleRepository;

import java.util.List;

@RestController
@RequestMapping("/dealers")
public class DealerController {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private CarRepository carRepository;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public DealerController(UserRepository userRepository,
                            RoleRepository roleRepository,
                            CarRepository carRepository,
                            PasswordEncoder passwordEncoder) {
        this.carRepository = carRepository;
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @TimeMessure
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    List<User> getAllDealers() {
        return this.userRepository.findAll();
    }

    @RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
    @ResponseBody
    User getDealerByLogin(@PathVariable String login) {
        return this.userRepository.findUserByLogin(login);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    @ResponseBody
    User getDealer(@PathVariable Long id) {
        return this.userRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    void addDealer(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        this.userRepository.save(user);
    }

}
