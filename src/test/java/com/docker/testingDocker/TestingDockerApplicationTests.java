package com.docker.testingDocker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class TestingDockerApplicationTests {

	public static Logger logger= Logger.getLogger(TestingDockerApplicationTests.class.getName());

	@Test
	void contextLoads() {
		logger.info("test case executing");
		Assertions.assertEquals(true,true);
	}

}
