package com.ivoronline.springboot_db_query_native_projection_interface.runners;

import com.ivoronline.springboot_db_query_native_projection_interface.entities.Person;
import com.ivoronline.springboot_db_query_native_projection_interface.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoadPersons implements CommandLineRunner {

  //PROPERTIES
  @Autowired PersonRepository personRepository;

  //=======================================================================================
  // RUN
  //=======================================================================================
  @Override
  @Transactional
  public void run(String... args) throws Exception {
    personRepository.save(new Person("John" , 20));
    personRepository.save(new Person("John" , 21));
    personRepository.save(new Person("Bill" , 30));
  }

}

