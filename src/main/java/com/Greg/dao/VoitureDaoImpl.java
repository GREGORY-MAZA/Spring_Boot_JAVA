package com.Greg.dao;

import com.Greg.model.Voiture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // appliquée à la classe afin d'indiquer à Spring qu'il s'agit d'une classe qui gère les données
public class VoitureDaoImpl implements VoitureDao {

    public List<Voiture> voitures = new ArrayList<>();

    public VoitureDaoImpl() {

        voitures.add(new Voiture(20, "Mustang", "FORD", "rouge", 98000));
        voitures.add(new Voiture(5, "BUGATTI", "Divo", "noir", 239000));
        voitures.add(new Voiture(46, "Model S", "Tesla", "Blanc", 75000));
        voitures.add(new Voiture(93, "720s", "McLAREN", "bleu", 750000));
        voitures.add(new Voiture(30, "308", "PEUGEOT", "Gris", 27000));

    }

    @Override
    public List<Voiture> voitureFindAll() {
        return voitures; //renvoie tous les produits que nous avons créés
    }

    @Override
    public Voiture findByIdCar(int id) {
        for (Voiture voiture : voitures) {
            if (voiture.getId() == id) {
                return voiture; //vérifie s'il y a un produit avec l'id donnée dans notre liste de produits et le renvoie en cas de correspondance
            }
        }
        return null;

    }

    @Override
    public Voiture save(Voiture voiture) {
        voitures.add(voiture);
        return voiture; //ajoute le produit reçu à notre liste.
    }

    @Override
    public Voiture deleteByIdCar(int id) {
        for (Voiture voiture : voitures) {
            voitures.remove(voiture);
            if (voiture.getId() == id) {
                return voiture; //vérifie s'il y a un produit avec l'id donnée dans notre liste de produits et le renvoie en cas de correspondance
            }
        }
        return null;
    }
}
