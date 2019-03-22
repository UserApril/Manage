package com.rongzhi.database.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfig {
	
	@Value("${usp.datasource.driver-class-name}")
	private String jdbcDriver;
	
	@Value("${usp.datasource.url}")
	private String jdbcUrl;
	
	@Value("${usp.datasource.username}")
	private String jdbcUser;
	
	@Value("${usp.datasource.password}")
	private String jdbcPassword;
	
	@Value("${usp.datasource.publickey}")
	private String publicKey;
	
	@Value("${usp.datasource.lisdriver-class-name}")
	private String jdbcDriverLis;
	
	@Value("${usp.datasource.lisurl}")
	private String jdbcUrlLis;
	
	@Value("${usp.datasource.lisusername}")
	private String jdbcUserLis;
	
	@Value("${usp.datasource.lispassword}")
	private String jdbcPasswordLis;
	
	@Value("${usp.datasource.lispublickey}")
	private String publicKeyLis;
	
	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	public String getJdbcDriver() {
		return jdbcDriver;
	}

	public void setJdbcDriver(String jdbcDriver) {
		this.jdbcDriver = jdbcDriver;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getJdbcUser() {
		return jdbcUser;
	}

	public void setJdbcUser(String jdbcUser) {
		this.jdbcUser = jdbcUser;
	}

	public String getJdbcPassword() {
		return jdbcPassword;
	}

	public void setJdbcPassword(String jdbcPassword) {
		this.jdbcPassword = jdbcPassword;
	}

	public String getJdbcDriverLis() {
		return jdbcDriverLis;
	}

	public void setJdbcDriverLis(String jdbcDriverLis) {
		this.jdbcDriverLis = jdbcDriverLis;
	}

	public String getJdbcUrlLis() {
		return jdbcUrlLis;
	}

	public void setJdbcUrlLis(String jdbcUrlLis) {
		this.jdbcUrlLis = jdbcUrlLis;
	}

	public String getJdbcUserLis() {
		return jdbcUserLis;
	}

	public void setJdbcUserLis(String jdbcUserLis) {
		this.jdbcUserLis = jdbcUserLis;
	}

	public String getJdbcPasswordLis() {
		return jdbcPasswordLis;
	}

	public void setJdbcPasswordLis(String jdbcPasswordLis) {
		this.jdbcPasswordLis = jdbcPasswordLis;
	}

	public String getPublicKeyLis() {
		return publicKeyLis;
	}

	public void setPublicKeyLis(String publicKeyLis) {
		this.publicKeyLis = publicKeyLis;
	}
	
	

}