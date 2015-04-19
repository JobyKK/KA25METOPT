package demo.views;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Andrey on 16.04.2015.
 */
@Controller
public class StartPage{

        @RequestMapping("/")
        public String greeting() {
            return "greeting";
        }

}
