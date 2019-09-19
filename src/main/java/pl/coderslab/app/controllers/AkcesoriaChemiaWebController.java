package pl.coderslab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.model.dao.AkcesoriaDao;
import pl.coderslab.app.model.entities.Akcesoria;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/akcesoriaChemia")
public class AkcesoriaChemiaWebController {

    private AkcesoriaDao akcesoriaDao;

    public AkcesoriaChemiaWebController(AkcesoriaDao akcesoriaDao) {
        this.akcesoriaDao = akcesoriaDao;
    }

    @GetMapping
    public String prepareAllAkcesoriaPage(Model model) {
        model.addAttribute("akcesoriaChemia", akcesoriaDao.findAll());
        return "akcesoriaChemia/list";
    }

    @GetMapping({"/add", "edit"})
    public String prepareManageAkcesoriaPage(@RequestParam(required = false) Long id, Model model) {
        Akcesoria akcesoria;
        if (id == null) {
            akcesoria = new Akcesoria();
        } else {
            akcesoria = akcesoriaDao.findById(id);
        }
        model.addAttribute("akcesoriaChemia", akcesoria);
        return "akcesoriaChemia/manage";
    }

    @PostMapping({"/add", "edit"})
    public String processManageAkcesoriaPage(@Valid Akcesoria akcesoria, BindingResult result) {
        if (result.hasErrors()) {
            return  "akcesoriaChemia/manage";
        }if(akcesoria.getId() == null){
            akcesoriaDao.create(akcesoria);
        }
        else {
            akcesoriaDao.update(akcesoria);
        }
        return "redirect:/akcesoriaChemia";
    }

    @GetMapping("/remove/{id}")
    public String prepareRemoveAkcesoriaPage(@PathVariable Long id, Model model) {
        Akcesoria akcesoria = akcesoriaDao.findById(id);
        if (akcesoria == null) {
            return "redirect:/akcesoriaChemia";
        }
        model.addAttribute("akcesoriaToRemove", akcesoria);
        return "akcesoriaChemia/remove";
    }

    @PostMapping("/remove/*")
    public String processRemoveAkcesoriaPage(Long id) {
        Akcesoria akcesoria = akcesoriaDao.findById(id);
        if (akcesoria != null) {
               akcesoriaDao.remove(akcesoria);
        }
        return "redirect:/akcesoriaChemia";
    }

    @ModelAttribute("dzielnice")
    public List<String> dzielnice() {
        return Arrays.asList("Psie Pole", "Fabryczna", "Krzyki", "Stare Miasto", "Srodmiescie");
    }
}

//    @PostMapping("/remove/*")
//    public String processRemoveBookPage(Long id) {
//        Book book = bookDao.findById(id);
//        if (book != null) {
//            bookDao.remove(book);
//        }
//        return "redirect:/books";
//    }