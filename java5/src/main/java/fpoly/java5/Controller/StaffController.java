package fpoly.java5.Controller;

import fpoly.java5.Model.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaffController {
    @GetMapping("/staff/new-staff")
    public String saveStaff (Model model) {
        Staff staff = new Staff();
        staff.setId("001");
        staff.setName("nguyen dang doan");
        staff.setEmail("nguyen@gmail.com");
        staff.setGender("Male");
        staff.setSalary(6000000);
        staff.setPosition("CEO");
        model.addAttribute("Staff", staff);
        return "staff/new-staff";
    }
}
