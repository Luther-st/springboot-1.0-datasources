package com.more_data.sources.repository.datasource2;

import com.more_data.sources.entity.datasource2.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House,Integer> {
}
