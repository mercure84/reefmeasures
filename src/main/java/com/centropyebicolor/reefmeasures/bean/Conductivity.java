package com.centropyebicolor.reefmeasures.bean;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Conductivity extends Measure{
    String unit = "mS/cm";
}
