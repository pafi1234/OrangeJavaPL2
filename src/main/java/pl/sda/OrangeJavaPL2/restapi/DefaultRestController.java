package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.configuration.WelcomeMessage;

@RestController //bean definition
@RequiredArgsConstructor
public class DefaultRestController {

    private final WelcomeMessage welcomeMessage;

    @GetMapping("/hello")
//    @RequestMapping(method = RequestMethod.GET, path = "/hello") // Both mappings do the same job
    public String hello(){
        return ("Hello ByczQ from anywhere " + welcomeMessage.getValue());
    }

}