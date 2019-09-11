package com.login.controller.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import com.login.model.Login;

@Controller
@SpanName("Login Controller")
public class LoginControllerImplement implements LoginControllerInterface {

  private static Logger logger = LoggerFactory.getLogger(LoginControllerImplement.class);

  /**
   * Login.
   *
   * @param body
   * 
   * @return the response entity
   */
  @Override
  public ResponseEntity<Void> login(@RequestBody Login login) {

    if (login.getUser().equals("user") && login.getPassword().equals("password")) {
      return new ResponseEntity<>(HttpStatus.OK);
    }
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }
}
