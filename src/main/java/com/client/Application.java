
package com.client;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.application.scheduler.QuartzJobScheduler;
import com.client.job.ClientJobFailed;
import com.client.job.ClientJobSuccess;


public class Application {

	private static final Logger LOG = LogManager.getLogger(Application.class);

	private static long APP_RUN_TIME = 60000L;


	public static void main(String[] args) {

		try {

			LOG.debug("Client application started");

			ClientJobSuccess printJobSuccess = new ClientJobSuccess("Print", 2, null, 10);
			ClientJobFailed fileLoadJobFailed = new ClientJobFailed("File load", 1, null, 5);

			ClientJobSuccess emailJobSuccess = new ClientJobSuccess("Email", 1, new Date(new Date().getTime() + 20000), 2);

			QuartzJobScheduler quartzJobSchedular = new QuartzJobScheduler();

			quartzJobSchedular.submitExternalJob(printJobSuccess);
			quartzJobSchedular.submitExternalJob(fileLoadJobFailed);
			quartzJobSchedular.submitExternalJob(emailJobSuccess);

			Thread.sleep(APP_RUN_TIME);

			quartzJobSchedular.stop();

			LOG.debug("Client application stopped");

		} catch (Exception e) {

			LOG.debug("Exception in client applicaiton\n" + e.getMessage());
		}
	}
}
