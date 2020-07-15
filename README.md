# spring-boot-mongodb-jwt

Spring boot application with JWT security. MongoDB as database.

- End Points

  - Sign Up > Register User
```
http://localhost:8080/api/appUser/signUp
```
- Request Body 

```
{
    "userName": "user",
    "password": "password"
}
```
  - add employee > Add Employee
```
http://localhost:8080/api/employee
```
- Request Body 

```
{
    "firstName": "John",
    "lastName": "Doe",
    "location": "USA",
    "department": "LOC"
}
```
  - get employee > Returns list of employees
```
http://localhost:8080/api/employees
```
  - get employee by Id> Returns employee for the Id
```
http://localhost:8080/api/employee/{id}
```
