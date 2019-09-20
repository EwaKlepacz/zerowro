package pl.coderslab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.model.dao.SpozywkaDao;
import pl.coderslab.app.model.entities.Spozywka;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/spozywka")
public class SpozywkaWebController {

    private SpozywkaDao spozywkaDao;

    public SpozywkaWebController(SpozywkaDao spozywkaDao) {
        this.spozywkaDao = spozywkaDao;
    }


    @GetMapping
    public String prepareAllSpozywkaPage(Model model) {
        model.addAttribute("spozywka", spozywkaDao.findAll());
        return "spozywka/list";
    }

    @GetMapping({"/add", "edit"})
    public String prepareManageSpożywkaPage(@RequestParam(required = false) Long id, Model model) {
        Spozywka spozywka;
        if (id == null) {
            spozywka = new Spozywka();
        } else {
            spozywka = spozywkaDao.findById(id);
        }
        model.addAttribute("spozywka", spozywka);
        return "spozywka/manage";
    }

    @PostMapping({"/add", "edit"})
    public String processManageKompostownikiPage(@Valid Spozywka spozywka, BindingResult result) {
        if (result.hasErrors()) {
            return "spozywka/manage";
        }
        if (spozywka.getId() == null) {
            spozywkaDao.create(spozywka);
        } else {
            spozywkaDao.update(spozywka);
        }
        return "redirect:/spozywka";
    }

    @GetMapping("/remove/{id}")
    public String prepareRemoveSpozywkaPage(@PathVariable Long id, Model model) {
        Spozywka spozywka = spozywkaDao.findById(id);
        if (spozywka == null) {
            return "redirect:/spozywka";
        }
        model.addAttribute("spozywkaToRemove", spozywka);
        return "spozywka/remove";
    }

    @PostMapping("/remove/*")
    public String processRemoveSpozywkaPage(Long id) {
        Spozywka spozywka = spozywkaDao.findById(id);
        if (spozywka != null) {
            spozywkaDao.remove(spozywka);
        }
        return "redirect:/spozywka";
    }


    @ModelAttribute("dzielnice")
    public List<String> dzielnice() {
        return Arrays.asList("Psie Pole", "Fabryczna", "Krzyki", "Stare Miasto", "Srodmiescie");

    }

    @ModelAttribute("typPunktu")
    public List<String> typPunktu() {
        return Arrays.asList("warzywniak", "piekarnia", "mięsny", "wędliny", "nabiał", "mlekomat", "produkty sypkie", "oleje");
    }
}


