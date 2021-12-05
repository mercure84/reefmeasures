package com.centropyebicolor.reefmeasures.helpers;

import com.centropyebicolor.reefmeasures.bean.*;
import org.springframework.stereotype.Component;

@Component
public class MyWonderfulUtils {


    public KindOfMeasure getClassOfMeasure(Measure measure) {

        if (measure instanceof AirHumidty) {
            return KindOfMeasure.AIRHUMIDITY;
        }
        if (measure instanceof WaterTemperature) {
            return KindOfMeasure.WATERTEMPERATURE;
        }
        if (measure instanceof Conductivity) {
            return KindOfMeasure.CONDUCTIVITY;
        }
        if (measure instanceof AirTemperature) {
            return KindOfMeasure.AIRTEMPERATURE;
        }
        if (measure instanceof Ph) {
            return KindOfMeasure.PH;
        }
        if (measure instanceof Redox) {
            return KindOfMeasure.REDOX;
        }
        return null;
    }

}
