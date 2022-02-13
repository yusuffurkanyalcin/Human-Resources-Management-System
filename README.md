## Postgresql database resource [click here !](https://github.com/yusuffurkanyalcin/Human-Resources-Management-System/blob/master/mydb.sql)

# HRMS (Human Resource Management System)
HRMS is a type of human resource management software.\
It combines a set of systems and processes to enable easy management of human resources , busines processes and datas.

# Features
- Candidate can register in the system with verify national status verification and email verification.
- Candidate can add resume to the system.
- Employer can add job advertisement(s) to the system.

# Available API Codes

- **Main url : `localhost:8080`**\
**1.** Download and run project.\
**2.** You can see all API requests now.

### `/candidate/add`
- This API provides us to **register new candidates**
- Format : JSON
  ```
{
  "firstName": "John",
  "lastName": "Smith",
  "age": 25
}
```
- POST Operation

### `/candidates/getall`
- This API provides us to **get all candidates**
- GET Operation

### `/candidates/getresume?candidateId=`
- This API provides us to **get resume of candidate by candidateId**
- GET Operation

### `/employer/getall`
- This API provides us to **get all employers**
- GET Operationo

### `/job-advertisement/getallactive`
- This API provides us to **get all active job advertisements**
- GET Operation

### `/job-advertisement/add`
- This API provides us to **add new job advertisement**
- GET Operation


