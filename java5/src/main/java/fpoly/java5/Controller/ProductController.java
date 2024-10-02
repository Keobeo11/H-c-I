package fpoly.java5.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product")
public class ProductController {
    @GetMapping(value = "/product-list")
    public String handlProductlist(){
        return "product/product-list";
    }
    @GetMapping(value = "/create-product")
    public String handlCreateProduct(){
        return "product/create-product";
    }
    @RequestMapping(params = "sort=price")
    public String sortByPriceString(Model model){
        model.addAttribute("sort", "price");
        return "product/sort-by-price";
    }
}
