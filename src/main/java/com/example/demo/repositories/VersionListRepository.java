package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.demo.classes.VersionsList;



public interface VersionListRepository extends CrudRepository <VersionsList, Integer>{
    
}


