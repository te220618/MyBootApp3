package jp.te4a.spring.boot.myapp5.mybootapp5;

//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Hello world!
 */
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model) {
        // return "this is Spring Boot sample.";
        return "index";
    }
}