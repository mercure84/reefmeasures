package com.centropyebicolor.reefmeasures.bean;

import lombok.Data;

import javax.persistence.Entity;



@Data
@Entity
public class WaterTemperature extends Measure {

    String unit = "°C";

}
