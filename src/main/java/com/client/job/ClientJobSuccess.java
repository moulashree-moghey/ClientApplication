
package com.client.job;

import java.util.Date;


public class ClientJobSuccess extends ClientJob {

	public ClientJobSuccess(String jobId, int priority, Date scheduledTime, int jobExecutionTimeInSeconds) {

		super(jobId, priority, scheduledTime, jobExecutionTimeInSeconds);
	}

	public boolean execute() throws Exception { return super.execute(); }
}
