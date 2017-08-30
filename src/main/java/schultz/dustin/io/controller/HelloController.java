package schultz.dustin.io.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jingshanyin on 8/26/17.
 */
@RestController
public class HelloController {

    @Value("${multipart.location}")
    private String location;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hello() {
        System.out.println(location);
        return location + ",,,nihao";
    }
}
