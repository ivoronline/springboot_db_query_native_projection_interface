package com.ivoronline.springboot_db_query_native_projection_interface.controllers;

import com.ivoronline.springboot_db_query_native_projection_interface.entities.PersonView;
import com.ivoronline.springboot_db_query_native_projection_interface.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN SINGLE PROPERTY
  //================================================================
  @RequestMapping("ReturnPersonView")
  PersonView returnPersonView() {
    PersonView personView = personRepository.returnPersonView();
    return     personView;
  }

}


