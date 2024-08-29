package oauth2_client.oauth2_client.controllers;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String homecontroller(Authentication authentication, Model model) {
        System.out.println("Authentication object: " + authentication);
        model.addAttribute("auth", authentication);
        // Return the view name
        return "index"; // Assuming you're using Thymeleaf and have an index.html in templates folder
    }
}