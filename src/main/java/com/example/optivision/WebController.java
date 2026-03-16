package com.example.optivision;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;

@Controller
public class WebController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("list", Arrays.asList(
                new Product("Aviator", "Ray-Ban", 199.0, "https://images.unsplash.com/photo-1572635196237-14b3f281503f?w=500"),
                new Product("Round Metal", "Oakley", 155.0, "https://images.unsplash.com/photo-1511499767350-a1590fdb2e17?w=500"),
                new Product("Cat Eye", "Gucci", 320.0, "https://images.unsplash.com/photo-1508296695146-257a814070b4?w=500")
        ));
        return "index";
    }
}