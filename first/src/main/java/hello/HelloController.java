package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public @ResponseBody String hello() {
        return "Hello, there!))";
    }

    @RequestMapping("/hi")
    public @ResponseBody String hi() {
        return "I said Hi, too!!))";
    }
}
