package pl.coderslab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.model.dao.ZwłasnymKubkiemDao;
import pl.coderslab.app.model.entities.Spozywka;
import pl.coderslab.app.model.entities.ZwłasnymKubkiem;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/zwlasnymkubkiem")
public class ZwłasnymKubkiemWebController {

    private ZwłasnymKubkiemDao zwłasnymKubkiemDao;

    public ZwłasnymKubkiemWebController(ZwłasnymKubkiemDao zwłasnymKubkiemDao) {
        this.zwłasnymKubkiemDao = zwłasnymKubkiemDao;
    }

            @GetMapping
        public String prepareAllZwlasnymkubkiemPage(Model model) {
            model.addAttribute("zwlasnymkubkiem", zwłasnymKubkiemDao.findAll());
            return "zwlasnymkubkiem/list";
        }


        @GetMapping({"/add", "edit"})
        public String prepareManageZwlasnymKubkiemPage(@RequestParam(required = false) Long id, Model model) {
           ZwłasnymKubkiem zwłasnymKubkiem;
            if (id == null) {
                zwłasnymKubkiem = new ZwłasnymKubkiem();
            } else {
                zwłasnymKubkiem = zwłasnymKubkiemDao.findById(id);
            }
            model.addAttribute("zwlasnymkubkiem", zwłasnymKubkiem);
            return "zwlasnymkubkiem/manage";
        }


        @PostMapping({"/add", "edit"})
        public String processManageKompostownikiPage(@Valid ZwłasnymKubkiem zwłasnymKubkiem, BindingResult result) {
            if (result.hasErrors()) {
                return "zwlasnymkubkiem/manage";
            }
            if (zwłasnymKubkiem.getId() == null) {
                zwłasnymKubkiemDao.create(zwłasnymKubkiem);
            } else {
                zwłasnymKubkiemDao.update(zwłasnymKubkiem);
            }
            return "redirect:/zwlasnymkubkiem";
        }

            @GetMapping("/remove/{id}")
        public String prepareRemoveZwalsnymKubkiemPage(@PathVariable Long id, Model model) {
            ZwłasnymKubkiem zwłasnymKubkiem = zwłasnymKubkiemDao.findById(id);
            if (zwłasnymKubkiem == null) {
                return "redirect:/spozywka";
            }
            model.addAttribute("zwlansnymkubkiemToRemove", zwłasnymKubkiem);
            return "zwlasnymkubkiem/remove";
        }
 @PostMapping("/remove/*")
        public String processRemoveZwlasnymKubkiemPage(Long id) {
        ZwłasnymKubkiem zwłasnymKubkiem = zwłasnymKubkiemDao.findById(id);
            if (zwłasnymKubkiem != null) {
                zwłasnymKubkiemDao.remove(zwłasnymKubkiem);
            }
            return "redirect:/zwlasnymkubkiem";
        }


    @ModelAttribute("dzielnice")
    public List<String> dzielnice() {
        return Arrays.asList("Psie Pole", "Fabryczna", "Krzyki", "Stare Miasto", "Srodmiescie");
    }
}




