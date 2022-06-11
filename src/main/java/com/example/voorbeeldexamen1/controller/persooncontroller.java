package com.example.voorbeeldexamen1.controller;

import com.example.voorbeeldexamen1.model.Persoon;
import com.example.voorbeeldexamen1.model.PersoonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Optional;

@Controller
public class persooncontroller {
    PersoonDao persoonDao;
    @Autowired
    public persooncontroller(PersoonDao persoonDao){this.persoonDao = persoonDao;}

    @RequestMapping(value = "opvraging/{string}",method = RequestMethod.GET )
    public String naam(ModelMap map, @PathVariable(value = "string"){
        
        Optional<Persoon> optional =
    }
}
