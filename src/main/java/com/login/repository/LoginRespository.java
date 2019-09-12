package com.login.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.login.model.Login;

/**
 * 
 * @author jmmacedo
 *
 */
@Repository
public interface LoginRespository extends MongoRepository<Login, String> {

  /**
   * 
   * @param login
   * @return
   */
  // Void register(Login login);


  /**
   * 
   * @param id
   * @return
   */
  Login findPasswordByUser(String login);

}
