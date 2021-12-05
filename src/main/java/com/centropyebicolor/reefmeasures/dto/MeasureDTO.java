package com.centropyebicolor.reefmeasures.dto;

import com.centropyebicolor.reefmeasures.bean.Measure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeasureDTO extends JpaRepository<Measure, Integer> {
    List<Measure> getMeasuresByValueNotNullOrderByDateAsc();
}
