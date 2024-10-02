package fpoly.java5.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
    @GetMapping("/auth/login")
    public String Showlogin() {
        return "auth/login";
    }
    @PostMapping("/auth/login")
    public String processLogin(@RequestParam("email") String email,
                               @RequestParam("password")String password, Model model) {
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        return "auth/acc-info";
    }
}
