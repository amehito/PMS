package com.PMS.start;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class AppApplicationTests {
	Logger logger =org.slf4j.LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		//日志的级别
		//由低到高
		//可以调整输出日志的级别，日志就只会在这个级别以后的高级别生效。
		System.out.println("test");
		logger.trace("这是trace日志");
		logger.debug("这是debug日志");
		logger.info("这是info日志");
		logger.warn("这是warn日志");
		logger.error("这是error日志");
	}


}
