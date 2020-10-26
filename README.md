# job-details-service

**URLS**

```
POST - http://localhost:8080/job
{
	"userId":"34",
	"jobName": "Developer",
	"jobDescription":"I a good job"

}

GET - http://localhost:8080/jobs

Database- h2(in memory database)

```

**Instructions**

* Build project once so that domain values get insert in the tables.
* h2-console url - http://localhost:8080/h2-console

**Scope of Improvements**

* Spring security features can be added
* Loggers can be added
* Specific message to validation can be added
* OAuth 2/JWT/ Basic Auth can be added
* User Entity is not used but added as for convienience
* JUnits can be added
* Specific Exceptions can be added in GlobalException class
* Exceptions can be thrown on certain condition and can be managed in controller advice


