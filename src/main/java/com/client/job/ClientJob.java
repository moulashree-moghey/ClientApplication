
package com.client.job;

import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.application.external.job.ExternalJob;


public class ClientJob implements ExternalJob {

	private static final Logger LOG = LogManager.getLogger(ClientJob.class);

	private String jobId;
	private int priority;
	private Date scheduledTime;
	private int jobExecutionTime;


	public ClientJob(String jobId, int priority, Date scheduledTime, int jobExecutionTimeInSeconds) {

		this.jobId = jobId;
		this.priority = priority;
		this.scheduledTime = scheduledTime;
		this.jobExecutionTime = jobExecutionTimeInSeconds;
	}

	public String getJobId() { return jobId; }

	public int getPriority() { return priority; }

	public Date getScheduledTime() { return scheduledTime; }

	public boolean execute() throws Exception {

		LOG.debug("EXECUTION STARTED - jobId = [" + jobId + "], priority = [" + priority + "] is started at [" + new Date() + "]");

		Thread.sleep(jobExecutionTime * 1000);

		LOG.debug("EXECUTION COMPLETED - jobId = [" + jobId + "], priority = [" + priority + "] is completed at [" + new Date() + "]");

		return true;
	}

	public void commit() {}

	public void rollback() {}
}
