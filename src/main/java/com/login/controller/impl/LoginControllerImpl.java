package com.login.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import com.login.controller.LoginController;
import com.login.model.Login;
import com.login.repository.LoginRespository;

/**
 * 
 * @author jmmacedo
 *
 */
@Controller
@SpanName("Login Controller")
public class LoginControllerImpl implements LoginController {

  private static Logger logger = LoggerFactory.getLogger(LoginControllerImpl.class);

  @Autowired
  private LoginRespository loginRepo;

  /**
   * Login.
   *
   * @param body
   * 
   * @return the response entity
   */
  @Override
  public ResponseEntity<Void> login(@RequestBody Login login) {

    logger.info("Login of user: ", login);

    if (loginRepo.findPasswordByUser(login.getUser()).getPassword().equals(login.getPassword())) {
      logger.info("Found login data of user: ", login.getUser());
      return new ResponseEntity<>(HttpStatus.OK);
    }

    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }


  /**
   * Login.
   *
   * @param body
   * 
   * @return the response entity
   */
  @Override
  public ResponseEntity<String> register(@RequestBody Login login) {

    if (loginRepo.findById(login.getUser()).isPresent()) {
      String response = "User already exists";
      return new ResponseEntity<>(response, HttpStatus.OK);

    }
    loginRepo.insert(login);

    return new ResponseEntity<>(HttpStatus.CREATED);
  }
}
