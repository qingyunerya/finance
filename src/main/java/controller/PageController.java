package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	@RequestMapping("/")
    public ModelAndView jump() {
        ModelAndView mav = new ModelAndView("redirect:/login");
        return mav;
    } 
    @RequestMapping("/login")
    
    String Login()
    {
        return "login";
    }
    @RequestMapping("/index")
    String index()
    {
        return "index";
    }
    @RequestMapping("/chart")
    String chart()
    {
        return "chart";
    }
    @RequestMapping("/empty")
    String empty()
    {
        return "empty";
    }
    @RequestMapping("/manage")
    String mange()
    {
        return "manage";
    }
    @RequestMapping("/table")
    String table()
    {
        return "table";
    }
}
