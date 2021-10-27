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

    //variable de type VoitureDao, que nous avons annotée avec @Autowired afin que Spring se charge d'en fabriquer une instance
    //VoitureDao a désormais accès à toutes les méthodes que nous avons définies.

    @Autowired
    private VoitureDao voitureDao;

    // ------------- Récupérer la liste des Voitures -------------

    @GetMapping(value = "/Voitures")
    public String listeVoitures(Model model) {
        model.addAttribute("voitures", voitureDao.voitureFindAll());
        return "voitures";

    }

    // ------------- Récupérer une voiture par rapport à son ID -------------

    //    L'utilisateur envoie une requête GET vers /Voitures/20
    //    Le dispatcheur cherche dans votre contrôleur la méthode qui répond au pattern "/Voitures/{id}" et l'exécute
    //    La méthode (dans ce cas listeVoitures ) fait appel au DAO pour qu'il communique avec la base de données
    //    Il récupère les informations sur le produit puis il crée une instance de Voiture qu'il renvoie ensuite à votre méthode.



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
    @PostMapping(value = "/Voitures")
    public void ajouterVoiture(@RequestBody Voiture voiture) {
        voitureDao.save(voiture);
    }

//--------------------------------END--------------------------------------
}

