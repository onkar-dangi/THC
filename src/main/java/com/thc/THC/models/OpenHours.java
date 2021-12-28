package com.thc.THC.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class OpenHours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date openTime;
    private Date closingTime;
}
