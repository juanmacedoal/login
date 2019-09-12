package com.login.repository;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * 
 * @author jmmacedo
 *
 */
public class LoginRepositoryImpl {

  private static final Logger logger = LoggerFactory.getLogger(LoginRepositoryImpl.class);
  /** The Constant formatter. */
  private static final DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-dd-MM");

  @Autowired
  private MongoOperations mongoOperation;

  /** The mongo template. */
  @Autowired
  private MongoTemplate mongoTemplate;



}
