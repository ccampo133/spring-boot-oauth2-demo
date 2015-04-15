package oauth2demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHelloWorld() {
        return "Hello world!";
    }
}
