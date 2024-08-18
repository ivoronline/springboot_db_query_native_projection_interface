package com.ivoronline.controller;

import com.ivoronline.dto.PersonDTO;
import com.ivoronline.repository.UtilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired UtilityRepository utilityRepository;

  //================================================================
  // GET PERSON DTO
  //================================================================
  @RequestMapping("GetPersonDTO")
  PersonDTO getPersonDTO() {
    PersonDTO personDTO = utilityRepository.getPersonDTO("Bill");
    return personDTO;
  }

  //================================================================
  // GET PERSON DTO LIST
  //================================================================
  @RequestMapping("GetPersonDTOList")
  List<PersonDTO> getPersonDTOList() {
    List<PersonDTO> personDTOS = utilityRepository.getPersonDTOList("John");
    return personDTOS;
  }

}


