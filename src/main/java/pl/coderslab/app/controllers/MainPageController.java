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
    @GetMapping({"/index","/"})
    public String prepareMainPage() {




        return "index";
    }
}


