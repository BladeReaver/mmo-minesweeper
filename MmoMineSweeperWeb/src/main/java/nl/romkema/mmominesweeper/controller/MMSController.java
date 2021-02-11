package nl.romkema.mmominesweeper.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MMSController {

//    @GetMapping("/users")
//    public List<User> getUsers() {
//        return (List<User>) userRepository.findAll();
//        return null;
//    }

//    @PostMapping("/users")
//    void addUser(@RequestBody User user) {
//        userRepository.save(user);
//    }

}
