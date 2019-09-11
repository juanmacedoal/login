package com.login.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * Application configuration.
 * 
 * @author Vector ITC Group
 *
 */
@EnableConfigurationProperties
@ConfigurationProperties
@Data
@Configuration
public class ApplicationConfiguration {

}
