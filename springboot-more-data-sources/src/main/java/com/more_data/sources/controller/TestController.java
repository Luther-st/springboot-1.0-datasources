package com.more_data.sources.controller;

import com.more_data.sources.entity.datasource.City;
import com.more_data.sources.entity.datasource2.House;
import com.more_data.sources.repository.datasource.CityRepository;
import com.more_data.sources.repository.datasource2.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    HouseRepository houseRepository;

    @GetMapping("/testDataSource")
    public String testDataSource(){
        City city = new City("北京","中国首都");
        cityRepository.save(city);
        return "success";
    }

    @GetMapping("/testDataSource2")
    public String testDataSource2(){
        House house = new House("豪宅","特别大的豪宅");
        houseRepository.save(house);
        return "success";
    }

}
