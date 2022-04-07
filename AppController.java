
package net.codejava;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private RestaurentService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Restaurentdetails> list = service.listAll();
        model.addAttribute(RestaurentDetails);

        return "index";
    }

    @RequestMapping("/new")
    public String showNewRestaurentPage(Model model) {
        RestaurentDetails restaurentDetails = new restaurentdetails();
        model.addAttribute("restaurent", saveRestaurent());

        return "new_product";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveRestaurent(@ModelAttribute("restaurent") Restaurent restaurent) {
        service.save(product);

        return "redirect:/";
    }


    }


}