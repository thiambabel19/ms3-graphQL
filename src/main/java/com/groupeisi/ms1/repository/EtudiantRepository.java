package com.groupeisi.ms1.repository;

import com.groupeisi.ms1.entities.Etudiant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends ElasticsearchRepository<Etudiant, Integer> {
    Etudiant findByTelephone(String telephone);
}
