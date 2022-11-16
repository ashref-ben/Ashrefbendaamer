package com.example.Ashrefbendaamer.Entity;




import lombok.*;
import org.springframework.data.relational.core.sql.In;

import javax.persistence.*;
import java.io.Serializable;



@Entity

@Table(name="Produit")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private  String description;
    private Integer prix;

  /*  public Produit(Integer id,String name,String description,Integer prix){
        super();
        this.id=id;
        this.name=name;
        this.description=description;
        this.prix=prix;
    }*/
}
