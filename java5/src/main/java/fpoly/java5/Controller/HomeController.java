package fpoly.java5.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    HttpServletRequest httpServletRequest;
    public String index(){
        httpServletRequest.setAttribute("message","Dependency injection");
        return "home";
    }
}
