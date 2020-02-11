package com.nt.atps.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class Constants {
	@Autowired
	Environment env;
	public static final Integer SERVER_PORT=6585;
	public static final String APP_NAME="JUNIT";
	public static final Integer val1=10;
}