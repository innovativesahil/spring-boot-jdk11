package sahil.springbootjava11demo.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController
@RequestMapping("/")
public class WelcomeController {

    @GetMapping
    @ResponseBody
    public Object get(){
        return IntStream.rangeClosed(1, 10).average();
    }
}
