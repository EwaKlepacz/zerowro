package pl.coderslab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.model.dao.DrogerieDao;
import pl.coderslab.app.model.entities.Drogeria;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/drogerie")

public class DrogerieWebController {
    private DrogerieDao drogerieDao;

    public DrogerieWebController (DrogerieDao drogerieDao) {
        this.drogerieDao = drogerieDao;
    }

        @GetMapping
    public String prepareAllDrogeriePage(Model model) {
        model.addAttribute("drogerie", drogerieDao.findAll());
        return "drogeria/list";
    }

        @GetMapping({"/add", "edit"})
    public String prepareManageDrogeriePage(@RequestParam(required = false) Long id, Model model) {
        Drogeria drogeria;
        if (id == null) {
            drogeria = new Drogeria();
        }
        else {
            drogeria = drogerieDao.findById(id);
        }
        model.addAttribute("drogeria", drogeria);
        return "drogeria/manage";
    }

    @PostMapping({"/add", "edit"})
    public String processManageDrogeriePage(@Valid Drogeria drogeria, BindingResult result) {
        if (result.hasErrors()) {
            return  "drogeria/manage";
        }if(drogeria.getId() == null){
            drogerieDao.create(drogeria);
        }
        else {
            drogerieDao.update(drogeria);
        }
        return "redirect:/drogerie";
    }

    @GetMapping("/remove/{id}")
    public String prepareRemoveDrogeriePage(@PathVariable Long id, Model model) {
        Drogeria drogeria = drogerieDao.findById(id);
        if (drogeria == null) {
            return "redirect:/drogerie";
        }
        model.addAttribute("drogeriaToRemove", drogeria);
        return "drogeria/remove";
    }

    @PostMapping("/remove/*")
    public String processRemoveDrogeriePage(Long id) {
        Drogeria drogeria = drogerieDao.findById(id);
        if (drogeria != null) {
           drogerieDao.remove(drogeria);
        }
        return "redirect:/drogerie";
    }


    @ModelAttribute("dzielnice")
    public List<String> dzielnice() {
        return Arrays.asList("Psie Pole", "Fabryczna", "Krzyki", "Stare Miasto", "Śródmieście");
    }
}