package com.yourpackage.controller; // Lưu ý tên package

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // BẮT BUỘC PHẢI CÓ DÒNG NÀY
public class ProductController {

    @GetMapping("/product") // BẮT BUỘC PHẢI CÓ DÒNG NÀY
    public String showProductPage(Model model) {
        model.addAttribute("productName", "Classic Round Frame");
        model.addAttribute("brand", "Ray-Ban");
        model.addAttribute("price", "2.500.000đ");

        return "product";
    }
}