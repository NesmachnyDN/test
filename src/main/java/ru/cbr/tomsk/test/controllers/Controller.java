package ru.cbr.tomsk.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.cbr.tomsk.test.domain.LastName;
import ru.cbr.tomsk.test.services.LastNameService;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private LastNameService lastNameService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<LastName> lastNameList = lastNameService.listAll();
        model.addAttribute("lastNameList", lastNameList);
        return "index";

    }

}
