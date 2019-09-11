package com.login.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 
 * @author jmmacedo
 *
 */

@Data
@Accessors(chain = true)
@JsonInclude(Include.NON_NULL)
public class Login {

	@JsonProperty("user")
	private String user;

	@JsonProperty("password")
	private String password;
}
