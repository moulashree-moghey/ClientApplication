
package com.client.job;

import java.util.Date;


public class ClientJobFailed extends ClientJob {

	public ClientJobFailed(String jobId, int priority, Date scheduledTime, int jobExecutionTimeInSeconds) {

		super(jobId, priority, scheduledTime, jobExecutionTimeInSeconds);
	}

	public boolean execute() throws Exception { return !super.execute(); }
}
