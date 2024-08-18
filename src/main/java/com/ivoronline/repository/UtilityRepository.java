package com.ivoronline.repository;

import com.ivoronline.entity.Utility;
import com.ivoronline.dto.PersonDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UtilityRepository extends CrudRepository<Utility, Integer> {

  //========================================================================================
  // GET PERSON DTO
  //=======================================================================================
  @Query(value = "SELECT NAME, AGE FROM PERSON WHERE NAME = :name", nativeQuery = true)
  PersonDTO getPersonDTO(String name);

  //=======================================================================================
  // GET PERSON DTO LIST
  //=======================================================================================
  @Query(value = "SELECT NAME, AGE FROM PERSON WHERE NAME = :name", nativeQuery = true)
  List<PersonDTO> getPersonDTOList(String name);

}
