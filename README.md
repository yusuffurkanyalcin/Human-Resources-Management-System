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
- POST Operation
- Format : 
 ```
{
  "firstName": "John",
  "lastName": "Smith",
  "identityNumber": "00000000000",
  "birthYear": 2000,
  "email": "john@gmail.com",
  "password": "1234567,
  "passwordAgain": "1234567"
}
```

### `/candidate/getall`
- This API provides us to **get all candidates**
- GET Operation
- Return type List<Candidate>
 
  ### `/candidate-image/getbycandidateid?candidateId={candidateId}`
- This API provides us to **get candidate image informations by candidateId**
- GET Operation
- Return type format : 
 ```
{
  "message": null,
  "success": true,
  "data": {
      "id" : 3,
      "candidateId": 6,
      "url": "<there is url of image>",
      "name": "name of image",
      "imageId": "...."
  }
}
```

### `/resume/{candidateId}`
- This API provides us to **get resume of candidate by candidateId**
- GET Operation

 ### `/employer/add`
- This API provides us to **register new employers**
- POST Operation
 -Format : 
 ```
{
  "email": "company@gmail.com",
  "password": "1234567",
  "passwordAgain": "1234567",
  "companyName": "Company Name"
  "webAddress": "www.company.com",
  "phoneNumber": "0537xxxxxxx"
}
```
 
### `/employer/getall`
- This API provides us to **get all employers**
- GET Operation
- Return type List<Employer>

### `/job-advertisement/getallinactives`
- This API provides us to **get all inactive job advertisements**
- GET Operation
- Return type List<JobAdvertisement>

### `/job-advertisement/getallactives`
- This API provides us to **get all active job advertisements**
- GET Operation
- Return type List<JobAdvertisement>
 
 ### `/job-advertisement/getallinactivesbyemployerid?employerId={employerId}`
- This API provides us to **get all inactive job advertisements by employerId**
- GET Operation
- Return type List<JobAdvertisement>
 
 
 


