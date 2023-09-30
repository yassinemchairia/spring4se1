package com.example.demo.Entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Entity
@Table( name = "Bloc")
public class Bloc implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="idBloc")
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="blocs")
    private Set<Chambre> chambres;
    @ManyToOne
    Foyer foyers;
}