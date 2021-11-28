package com.centropyebicolor.reefmeasures.dto;

import com.centropyebicolor.reefmeasures.bean.WaterTemperature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterTemperatureDTO extends JpaRepository<WaterTemperature, Integer> {
}
