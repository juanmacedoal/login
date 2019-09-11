package com.login.controller.login;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.login.model.Login;

@RequestMapping(value = LoginControllerInterface.LOGIN_PATH)
public interface LoginControllerInterface {

	public static final String LOGIN_PATH = "/login";

	/**
	 * Devices id delete.
	 *
	 * @param id
	 *            the id
	 * @return the response entity
	 */
	// @ApiOperation(value = "Delete client profile", notes = "Delete Client
	// Profile", response = Void.class, tags = {})
	// @ApiResponses(value = {
	// @ApiResponse(code = 200, message = "Successful response", response =
	// Void.class),
	// @ApiResponse(code = 400, message = "Bad request", response =
	// Void.class)})
	@RequestMapping(value = "/", produces = {
			MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.DELETE)
	ResponseEntity<Void> login(@RequestBody Login login);
}
