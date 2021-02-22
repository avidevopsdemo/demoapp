package demo.security.azure.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping( "home" )
    public String home() {
        return String.format( "Welcome to Demo App");
    }
}
