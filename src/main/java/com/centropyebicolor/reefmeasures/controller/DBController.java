package com.centropyebicolor.reefmeasures.controller;

import com.centropyebicolor.reefmeasures.bean.WaterTemperature;
import com.centropyebicolor.reefmeasures.dto.WaterTemperatureDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DBController {


    @Autowired
    WaterTemperatureDTO waterTemperatureDTO;

    @GetMapping(path = "/addWaterTemperature/{measure}")
    public WaterTemperature addWaterTemperature(@PathVariable String measure){

        WaterTemperature data = new WaterTemperature();
        data.setDate(new Date());
        data.setValue(Float.parseFloat(measure));
        waterTemperatureDTO.save(data);
        System.out.println("Data has been saved : " + data);
        return data;

    }

}
