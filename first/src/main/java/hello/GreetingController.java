package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String tmpl = "Hello, my friend, %s))";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greet")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "User") String name){
        return new Greeting(counter.incrementAndGet(), String.format(tmpl, name));
    }
}
