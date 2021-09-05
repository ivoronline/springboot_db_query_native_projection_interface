package com.ivoronline.springboot_db_query_native_projection_interface.repositories;

import com.ivoronline.springboot_db_query_native_projection_interface.entities.Person;
import com.ivoronline.springboot_db_query_native_projection_interface.entities.PersonView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {

  //=======================================================================================
  // RETURN PERSON VIEW
  //=======================================================================================
  @Query(nativeQuery = true, value = "SELECT * FROM PERSON WHERE NAME = 'John'")
  PersonView returnPersonView();

}
