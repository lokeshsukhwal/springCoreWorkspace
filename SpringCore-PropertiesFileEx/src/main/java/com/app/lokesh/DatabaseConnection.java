package com.app.lokesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
	@Value("${app.db.driver}")
	private String driver;
	@Value("${app.db.url}")
	private String url;
	@Value("${app.db.userName}")
	private String userName;
	@Value("${app.db.password}")
	private String password;

	@Override
	public String toString() {
		return "DatabaseConnection [driver=" + driver + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}

}
