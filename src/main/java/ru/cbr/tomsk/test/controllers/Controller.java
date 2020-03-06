package ru.cbr.tomsk.test.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.cbr.tomsk.test.domain.LastName;
import ru.cbr.tomsk.test.domain.Man;
import ru.cbr.tomsk.test.services.LastNameService;
import ru.cbr.tomsk.test.services.ManService;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private ManService manService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Man> manList = manService.listAll();
        model.addAttribute("manList", manList);
        return "index";

    }

}
