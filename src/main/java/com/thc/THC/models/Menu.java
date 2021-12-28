package com.thc.THC.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKeyJoinColumn
    private Long id;

    @OneToMany(targetEntity = FoodItem.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FoodItem> menues;
}
