package com.SpringBoot.Portfolio.controller;

import com.SpringBoot.Portfolio.dto.ContactMeDto;
import com.SpringBoot.Portfolio.service.ContactMeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    ContactMeService contactMeService;

    @GetMapping({"/","/home"})
    public String indexPage(Model model) {
        ContactMeDto contactMeDto = new ContactMeDto();
        model.addAttribute("contactMeDto", contactMeDto);
        return "index";
    }

    @PostMapping("/submit-contactMe")
    public String submitContactMe(ContactMeDto contactMeDto){
        System.out.println(contactMeDto.toString());
        contactMeService.saveMessage(contactMeDto);
        return "redirect:/home";
    }
}
