package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repositories.VersionListRepository;
import com.example.demo.classes.VersionsList;
import java.util.List;

    
@RestController
@RequestMapping("/codingworld")
public class VersionListController {


  @Autowired
  VersionListRepository versionsListRepository;

  @GetMapping("/sayhello")
  public String sayHello(){
    return "хуй";
  }

  @GetMapping("/get-versions")
  public List<VersionsList> getAllVersions() {
    List<VersionsList> books = (List<VersionsList>) versionsListRepository.findAll();
    return books;
  }
}
