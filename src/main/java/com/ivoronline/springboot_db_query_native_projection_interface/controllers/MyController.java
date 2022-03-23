package com.ivoronline.springboot_db_query_native_projection_interface.controllers;

import com.ivoronline.springboot_db_query_native_projection_interface.entities.PersonProjection;
import com.ivoronline.springboot_db_query_native_projection_interface.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON PROJECTION
  //================================================================
  @RequestMapping("ReturnPersonProjection")
  PersonProjection returnPersonProjection() {
    PersonProjection personProjection = personRepository.returnPersonProjection("Bill");
    return personProjection;
  }

  //================================================================
  // RETURN PERSON PROJECTIONS
  //================================================================
  @RequestMapping("ReturnPersonProjections")
  List<PersonProjection> returnPersonProjections() {
    List<PersonProjection> personProjections = personRepository.returnPersonProjections("John");
    return personProjections;
  }

}


