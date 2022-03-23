package com.ivoronline.springboot_db_query_native_projection_interface.repositories;

import com.ivoronline.springboot_db_query_native_projection_interface.entities.Person;
import com.ivoronline.springboot_db_query_native_projection_interface.entities.PersonProjection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //========================================================================================
  // RETURN PERSON PROJECTION
  //=======================================================================================
  @Query(value = "SELECT name, age FROM PERSON WHERE NAME = :name", nativeQuery = true)
  PersonProjection returnPersonProjection(String name);

  //=======================================================================================
  // RETURN PERSON PROJECTIONS
  //=======================================================================================
  @Query(value = "SELECT name, age FROM PERSON WHERE NAME = :name", nativeQuery = true)
  List<PersonProjection> returnPersonProjections(String name);

}
