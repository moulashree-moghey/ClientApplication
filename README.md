# ClientApplicationDemo

- This is a demo application which uses SimpleJobSchedular to run different tasks/jobs.
- Following is simple description about classes

# com.client.Application

- It represents dummy client application
- Application keeps scheduler active for 60 seconds and then stops it

- It creates following jobs and submit them to scheduler
  - Print job
    - It simulates printing task which
      - takes 10 seconds to finish
      - has priority 2
      - should start immediately after submitting to scheduler
      - simulates successfully completed job

  - File load job
    - It simulates file loading task which
      - takes 5 seconds to finish
      - has priority 1
      - should start immediately after submitting to scheduler
      - simulates failed job

  - Email job
    - It simulates email sending task which
      - takes 2 seconds to finish
      - has priority 1
      - should execute after 20 seconds after submitting to scheduler
      - simulates successfully completed job

# com.client.job.ClientJob

- It is dummy client task/job and acts as external job for scheduler

# com.client.job.ClientJobSuccess

- It is dummy client task/job and acts as external job for scheduler
- It represents task/job which successfully completes it's execution

# com.client.job.ClientJobFailed

- It is dummy client task/job and acts as external job for scheduler
- It represents task/job which fails in execution
