package pl.coderslab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.model.dao.KompostownikiDao;
import pl.coderslab.app.model.entities.Drogeria;
import pl.coderslab.app.model.entities.Kompostowniki;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/kompostowniki")
public class KompostownikiWebController {
    private KompostownikiDao kompostownikiDao;

    public KompostownikiWebController(KompostownikiDao kompostownikiDao) {
        this.kompostownikiDao = kompostownikiDao;
    }

    @GetMapping
    public String prepareAllKompostownikiPage(Model model) {
        model.addAttribute("kompostowniki", kompostownikiDao.findAll());
        return "kompostownik/list";
    }

    @GetMapping({"/add", "edit"})
    public String prepareManageKompostownikiPage(@RequestParam(required = false) Long id, Model model) {
        Kompostowniki kompostowniki;
        if (id == null) {
            kompostowniki = new Kompostowniki();
        } else {
            kompostowniki = kompostownikiDao.findById(id);
        }
        model.addAttribute("kompostowniki", kompostowniki);
        return "kompostownik/manage";
    }

    @PostMapping({"/add", "edit"})
    public String processManageKompostownikiPage(@Valid Kompostowniki kompostowniki, BindingResult result) {
        if (result.hasErrors()) {
            return "kompostownik/manage";
        }
        if (kompostowniki.getId() == null) {
            kompostownikiDao.create(kompostowniki);
        } else {
            kompostownikiDao.update(kompostowniki);
        }
        return "redirect:/kompostowniki";
    }

    @GetMapping("/remove/{id}")
    public String prepareRemoveKompostownikiPage(@PathVariable Long id, Model model) {
       Kompostowniki kompostowniki = kompostownikiDao.findById(id);
        if (kompostowniki == null) {
            return "redirect:/kompostowniki";
        }
        model.addAttribute("kompostownikiToRemove", kompostowniki);
        return "kompostownik/remove";
    }

    @PostMapping("/remove/*")
    public String processRemoveKompostownikiPage(Long id) {
        Kompostowniki kompostowniki = kompostownikiDao.findById(id);
            if (kompostowniki != null) {
            kompostownikiDao.remove(kompostowniki);
        }
        return "redirect:/kompostowniki";


    }
    @ModelAttribute("dzielnice")
    public List<String> dzielnice() {
        return Arrays.asList("Psie Pole", "Fabryczna", "Krzyki", "Stare Miasto", "Srodmiescie");
    }
}