package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table( name = "Foyer")
public class Foyer  implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idFoyer")
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
    @OneToOne
    private Universite universites;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyers")
    private Set<Bloc> blocs;

}
