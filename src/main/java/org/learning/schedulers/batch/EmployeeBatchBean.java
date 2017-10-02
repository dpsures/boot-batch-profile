package org.learning.schedulers.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Profile("batch")
@Component
public class EmployeeBatchBean {

	private Logger logger = LoggerFactory.getLogger(EmployeeBatchBean.class);

	@Scheduled(fixedRateString = "${batch.fixed.rate.value}")
	public void fixedRateJob() throws InterruptedException{
		logger.info("fixed rate triggered - started");
		Thread.sleep(1000);
		logger.info("fixed rate triggered - stopped");
	}

	@Scheduled(cron = "${batch.cron.patter.value}")
	public void cronJob() throws InterruptedException{
		logger.info("cron job triggered - started");
		Thread.sleep(1000);
		logger.info("cron job triggered - stopped");
	}
}
