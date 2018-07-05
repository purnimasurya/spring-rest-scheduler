package org.tact.base.scheduler;

import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@Configuration
@EnableAsync
public class GeneralScheduler {

	@Scheduled(cron = "*/5 * * * * ?") //Every 5 seconds
	public void runFiveSecondsScheduler() throws Exception
	{
		System.out.println("Running every 5 seconds ["+new Date()+"]");			
	}
}
