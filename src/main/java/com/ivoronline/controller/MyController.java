package com.ivoronline.controller;

import com.ivoronline.dto.IPersonDTO;
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
  IPersonDTO getPersonDTO() {
    IPersonDTO personDTO  = utilityRepository.getPersonDTO("Bill");
    return personDTO ;
  }

  //================================================================
  // GET PERSON DTO LIST
  //================================================================
  @RequestMapping("GetPersonDTOList")
  List<IPersonDTO> getPersonDTOList() {
    List<IPersonDTO> personDTOList  = utilityRepository.getPersonDTOList("John");
    return personDTOList ;
  }

}


