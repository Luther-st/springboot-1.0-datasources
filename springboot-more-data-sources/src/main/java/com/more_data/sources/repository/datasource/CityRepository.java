package com.more_data.sources.repository.datasource;

import com.more_data.sources.entity.datasource.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
