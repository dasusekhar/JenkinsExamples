package com.example.demo.expense;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsExamplesApplicationTests {
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsExamplesApplication.class);
	@Test
	void contextLoads() {
		logger.info("test case exexuted");
	}

}
