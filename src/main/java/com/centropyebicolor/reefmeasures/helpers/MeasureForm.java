package com.centropyebicolor.reefmeasures.helpers;

import lombok.Data;

import java.util.Date;

@Data
public class MeasureForm {

    KindOfMeasure kind ;
    float value;
    Date date;

}
