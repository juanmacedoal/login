package com.login.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.login.model.Login;

/**
 * 
 * @author jmmacedo
 *
 */
public interface LoginController {



  /**
   * 
   * @param login
   * @return
   */
  @RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE},
      method = RequestMethod.GET)
  ResponseEntity<Void> login(@RequestBody Login login);


  /**
   * 
   * @param login
   * @return
   */
  @RequestMapping(value = "/", produces = {MediaType.APPLICATION_JSON_VALUE},
      method = RequestMethod.POST)
  ResponseEntity<String> register(@RequestBody Login login);
}
