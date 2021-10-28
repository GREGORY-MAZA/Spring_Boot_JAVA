package com.Greg.dao;

import com.Greg.model.Voiture;
import java.util.List;

public interface VoitureDao {

    public List<Voiture> voitureFindAll();
    public Voiture findByIdCar(int id);
    public Voiture save(Voiture voiture);
    public Voiture deleteByIdCar(int id);


}
