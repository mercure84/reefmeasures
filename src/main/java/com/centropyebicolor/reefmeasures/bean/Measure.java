package com.centropyebicolor.reefmeasures.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Measure {

    @Id
    @GeneratedValue
    int id;

    Date date = new Date();
    float value;
    String unit;

}
