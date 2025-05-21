package com.othmane;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(
		webEnvironment = WebEnvironment.NONE,
		properties = {
				"spring.profiles.active=test",
				"spring.autoconfigure.exclude=org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration,org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration,org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration"
		}
)
class ProjectManagementsSystemApplicationTests {

	@Test
	void contextLoads() {
	}
}