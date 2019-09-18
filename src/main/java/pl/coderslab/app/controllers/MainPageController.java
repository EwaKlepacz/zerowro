package pl.coderslab.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
@Controller
@RequestMapping("/mainPage")
public class MainPageController {

//        @GetMapping("/add")
//    public String prepareAddStudentPage(Model model) {
//        model.addAttribute("student", new Student());
//        return "students/add";
//    }
//    @PostMapping("/add")
//    @ResponseBody
//    public String processAddStudentPage(Student student){
//
//        return student.toString();
//    }

    @ModelAttribute("typ")
    public List<String> typ() {

        return Arrays.asList("Akcesoria i chemia", "Drogerie", "Spożywka", "Kompostowniki", "Z własnym kubkiem");
    }

    @ModelAttribute("dzielnice")
    public List<String> dzielnice() {

        return Arrays.asList("Stare Miasto", "Śródmieście", "Krzyki", "Psie Pole", "Fabryczna");
    }
}
