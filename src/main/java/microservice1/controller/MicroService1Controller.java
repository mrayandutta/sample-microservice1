package microservice1.controller;

import microservice1.model.ResponseModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MicroService1Controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@RequestMapping(value = "/microservice1",produces = MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(value = "/microservice1")
    public ResponseModel greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new ResponseModel(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping("/")
    String defaultResponse() {
        return "Hello World, Response from MicroService1 !!";
    }
}
