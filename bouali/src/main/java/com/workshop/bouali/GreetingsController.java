package com.workshop.bouali;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chhin_Hua - 21/01
 * ctrl o: overight methods
 * ctrl i: implement methods
 * ctrl alt t: surround with
 **/

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our API");
    }

    @GetMapping("/say-good-bye ")
    public ResponseEntity<String> sayGoodBye() {
        return ResponseEntity.ok("Good by and see you later");
    }

}
