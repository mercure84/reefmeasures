package com.centropyebicolor.reefmeasures.bean;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Redox extends Measure{
    String unit = "mV";
}
