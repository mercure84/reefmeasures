package com.centropyebicolor.reefmeasures.controller;

import com.centropyebicolor.reefmeasures.bean.*;
import com.centropyebicolor.reefmeasures.dto.MeasureDTO;
import com.centropyebicolor.reefmeasures.helpers.MeasureForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class DBController {


    @Autowired
    MeasureDTO measureDTO;

    @GetMapping(path = "/addWaterTemperature/{measure}")
    public WaterTemperature addWaterTemperature(@PathVariable String measure){

        WaterTemperature data = new WaterTemperature();
        data.setDate(new Date());
        data.setValue(Float.parseFloat(measure));
        measureDTO.save(data);
        System.out.println("Data has been saved : " + data);
        return data;

    }

    @PostMapping(path="/addSingleMeasure")
    public Measure addSingleMeasure(@RequestBody MeasureForm measureForm){
        Measure measure ;
        switch (measureForm.getKind()){
            case WATERTEMPERATURE:
                measure = new WaterTemperature();
                break;
            case AIRHUMIDITY:
                measure = new AirHumidty();
                break;
            case AIRTEMPERATURE:
                measure = new AirTemperature();
                break;
            case REDOX:
                measure = new Redox();
                break;
            case PH:
                measure = new Ph();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + measureForm.getKind());
        }

        if(measureForm.getDate() != null){
            measure.setDate(measureForm.getDate());

        }
        measure.setValue(measureForm.getValue());
        measureDTO.save(measure);
        return measure;
    }

}
