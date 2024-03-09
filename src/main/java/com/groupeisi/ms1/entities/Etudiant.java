package com.groupeisi.ms1.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(indexName = "etudiant_index")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 155)
    private String prenom;
    @Column(length = 155)
    private String nom;
    @Column(length = 155)
    private String adresse;
    @Column(length = 155)
    private String telephone;



}
