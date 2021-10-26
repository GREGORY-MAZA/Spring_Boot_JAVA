package com.Greg.dao;

import com.Greg.model.Voiture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class VoitureDaoImpl implements VoitureDao {

    public static List<Voiture> voitures = new ArrayList<>();

    static {

        voitures.add(new Voiture(20, "Mustang", "FORD", "rouge", 98000));
        voitures.add(new Voiture(5, "BUGATTI", "Divo", "noir", 239000));
        voitures.add(new Voiture(46, "Model S", "Tesla", "Blanc", 75000));
        voitures.add(new Voiture(93, "720s", "McLAREN", "bleu", 750000));
        voitures.add(new Voiture(30, "308", "PEUGEOT", "Gris", 27000));

    }

    @Override
    public List<Voiture> voitureFindAll() {
        return voitures;
    }

    @Override
    public Voiture findByIdCar(int id) {
        for (Voiture voiture : voitures) {
            if (voiture.getId() == id) {
                return voiture;
            }
        }
        return null;

    }

    @Override
    public Voiture save(Voiture voiture) {
        return null;
    }
}
