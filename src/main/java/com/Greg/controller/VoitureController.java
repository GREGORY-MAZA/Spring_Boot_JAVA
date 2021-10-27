package com.Greg.controller;

import com.Greg.dao.VoitureDao;
import com.Greg.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VoitureController {

    @Autowired
    private VoitureDao voitureDao;

    // ------------- Récupérer la liste des Voitures -------------

    @GetMapping(value = "/Voitures")
    public String listeVoitures(Model model) {
        model.addAttribute("voitures", voitureDao.voitureFindAll());
        return "voitures";

    }

    // ------------- Récupérer une voiture par rapport à son ID -------------

    //route
    @GetMapping(value = "Voitures/{id}")
    //@PathVariable pour pouvoir se servir de "id" dans la value de @GetMapping
    public String VoitureId(Model model ,@PathVariable("id") int id) {

        // "Car" = variable accessible dans le template
        model.addAttribute("Car", voitureDao.findByIdCar(id));

        if (voitureDao.findByIdCar(id) == null) {
        return "404";
        } else {
            // "voiture" = nom du template
            return "voiture";
        }
    }

    // ------------- Ajouter une voiture -------------

    //ajouter un produit
    @PostMapping(value = "/Produits")
    public void ajouterProduit(@RequestBody Voiture voiture) {
        voitureDao.save(voiture);
    }

//--------------------------------END--------------------------------------
}

