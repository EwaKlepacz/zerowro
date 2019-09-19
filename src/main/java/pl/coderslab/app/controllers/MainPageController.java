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
    @GetMapping("/mainPage")
    public String formularz(Model model) {

//        Model model1 = new Model();
//        model1.addAttribute("wyszukiwarka", wyszukiwarka);
////jeśli w formularzu zaznaczon jest dzielnica
//        if (dzielnice() != null && typ() == null) {
//            forEach(dzielnice(): dzielnica) {
//
//                AkcesoriaRepositories akcesoriaRepositories;
//                akcesoriaRepositories.findAkcesoriaByDzielnice(dzielnice());
//                DrogerieRepositories drogerieRepositories;
//                drogerieRepositories.findDrogeriaByDzielnica(dzielnice());
//                KompostownikiRepositories kompostownikiRepositories;
//                kompostownikiRepositories.findKompostownikiByDzielnica(dzielnice());
//                SpożywkaRepositories spożywkaRepositories;
//                spożywkaRepositories.findSpozywkaByDzielnica(dzielnice());
//                ZwłasnymKubkiemRepositories zwłasnymKubkiemRepositories;
//                zwłasnymKubkiemRepositories.findZwłasnymKubkiemByDzielnica(dzielnice());
//                return "find/dzielniceList";
//            }
//        }
////jeśli zaznaczony jest typ
//        if (dzielnice() == null && typ() != null) {
//            if (typ = "Akcesoria i chemia") {
//                AkcesoriaDao akcesoriaDao = new AkcesoriaDao();
//                akcesoriaDao.findAll();
//                return "akcesoriaChemia/list";
//
//            } else if (typ = "Drogerie") {
//                DrogerieDao drogerieDao = new DrogerieDao();
//                drogerieDao.findAll();
//            }
//            return "drogeria/list";
//
//        } else if (typ = "Spożywka") {
//            SpozywkaDao spozywkaDao = new SpozywkaDao();
//            spozywkaDao.findAll();
//
//        return "spozywka/list";
//
//        } else if( typ ="Kompostowniki") {
//        KompostownikiDao kompostownikiDao = new KompostownikiDao();
//        kompostownikiDao.findAll();
//
//        return "kompostownik/list";
//        }
//    else if (typ ="Z własnym kubkiem"){
//            ZwłasnymKubkiemDao zwłasnymKubkiemDao= new ZwłasnymKubkiemDao();
//            zwłasnymKubkiemDao.findAll();
//
//            return"zwlasnymkubkiem/list";
//            }
//
//
//// trzeci typ wyszukania jeśli oba są zaznaczone
//
//            if("typ"!=null&&"dzielnice"!=null){
//            forEach(List <String> typ : typ)
//            AkcesoriaDao akcesoriaDao=new AkcesoriaDao();
//            akcesoriaDao.findAll().findByDzielnice(dzielnice());
//
//            }
//            return"dzielnicaTypList";
//            }
//
//
//@ModelAttribute("typ")
//public List<String> typ(){
//
//        return Arrays.asList("Akcesoria i chemia","Drogerie","Spożywka","Kompostowniki","Z własnym kubkiem");
//        }
//
//@ModelAttribute("dzielnice")
//public List<String> dzielnice(){
//
//        return Arrays.asList("Stare Miasto","Śródmieście","Krzyki","Psie Pole","Fabryczna");
//        }

        return null;
    }
}

