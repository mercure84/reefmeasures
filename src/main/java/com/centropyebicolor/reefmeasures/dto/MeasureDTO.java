package com.centropyebicolor.reefmeasures.dto;

import com.centropyebicolor.reefmeasures.bean.Measure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeasureDTO extends JpaRepository<Measure, Integer> {

}
