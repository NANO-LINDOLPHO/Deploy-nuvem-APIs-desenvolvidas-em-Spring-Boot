package one.digitalinnovation.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/")
@ApiIgnore
public class HelloController {

    @GetMapping
    public String hello(){
        return "<h1 style='color: coral; text-shadow: 2px 2px 3px  black'><em>Hello DIO. Java devs...</em></h1>";
    }

}
