package main.java.com.pokemonbattle.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemonbattle.demo.service.FirebaseService;

@RestController
public class TestDBController {

    private final FirebaseService firebaseService;

    public TestDBController(FirebaseService firebaseService) {
        this.firebaseService = firebaseService;
    }

    @GetMapping("/firebase-test")
    public String testFirebase() {
        System.out.println("hola aa");
        return firebaseService.guardarDato();
    }
}
