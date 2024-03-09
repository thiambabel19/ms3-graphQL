package com.groupeisi.ms1.service;

import com.groupeisi.ms1.entities.Etudiant;

public interface EtudiantService {
    Etudiant add(Etudiant etudiant);
    Iterable<Etudiant> all();
    Etudiant update(int id, Etudiant etudiant);
    String delete(int id);
}
