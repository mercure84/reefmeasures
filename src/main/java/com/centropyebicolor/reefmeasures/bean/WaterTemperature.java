package com.centropyebicolor.reefmeasures.bean;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;



@Data
@Entity
@DiscriminatorValue("WaterTemperature")
public class WaterTemperature extends Measure {

    String unit = "°C";

}
