package org.learning.schedulers.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Profile("batch")
@Component
public class FixedDelayedBatch {

	private Logger logger = LoggerFactory.getLogger(FixedDelayedBatch.class);
	
	@Scheduled(initialDelayString = "${batch.initial.delay.value}", fixedDelayString = "${batch.fixed.delay.value}")
	public void fixedDelayedJob(){
		logger.info("fixeddelayed job run - start");
		logger.info("fixeddelayed job run - end");
	}
}
