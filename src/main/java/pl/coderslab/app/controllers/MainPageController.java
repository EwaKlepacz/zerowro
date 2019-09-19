package pl.coderslab.app.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.model.dao.*;
import pl.coderslab.app.model.entities.Kompostowniki;
import pl.coderslab.app.model.repositories.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class MainPageController {
    @GetMapping("/index")
    public String prepareMainPage() {

// @GetMapping
//        public String prepareAllSpozywkaPage(Model model) {
//            model.addAttribute("spozywka", spozywkaDao.findAll());
//            return "spozywka/list";
//        }
//
//        @GetMapping({"/add", "edit"})
//        public String prepareManageSpożywkaPage(@RequestParam(required = false) Long id, Model model) {
//           Spozywka spozywka;
//            if (id == null) {
//                spozywka = new Spozywka();
//            } else {
//                spozywka = spozywkaDao.findById(id);
//            }
//            model.addAttribute("spozywka", spozywka);
//            return "spozywka/manage";
//        }
//
//        @PostMapping({"/add", "edit"})
//        public String processManageKompostownikiPage(@Valid Spozywka spozywka, BindingResult result) {
//            if (result.hasErrors()) {
//                return "spozywka/manage";
//            }
//            if (spozywka.getId() == null) {
//                spozywkaDao.create(spozywka);
//            } else {
//                spozywkaDao.update(spozywka);
//            }
//            return "redirect:/spozywka";
//        }



        return "index";
    }
}


