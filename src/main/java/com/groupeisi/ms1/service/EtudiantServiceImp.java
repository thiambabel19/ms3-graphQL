package com.groupeisi.ms1.service;

import com.groupeisi.ms1.entities.Etudiant;
import com.groupeisi.ms1.repository.EtudiantRepository;
import org.springframework.stereotype.Service;


@Service
public class EtudiantServiceImp implements EtudiantService{
    private  final EtudiantRepository etudiantRepository;
    public EtudiantServiceImp(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    @Override
    public Etudiant add(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Iterable<Etudiant> all() {
        return ( etudiantRepository.findAll());
    }

    @Override
    public Etudiant update(int id, Etudiant etudiant) {
        return etudiantRepository.findById(id).map(e -> {
            e.setPrenom(etudiant.getPrenom());
            e.setNom(etudiant.getNom());
            return etudiantRepository.save(e);
        }).orElseThrow(() -> new RuntimeException("Etudiant non trouve !"));
    }
    
    @Override
    public String delete(int id) {
        etudiantRepository.deleteById(id);
        return "Etudiant supprime avec succes !";
    }
}
