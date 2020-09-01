# oauth2-authorization
This is sample oauth2 authorization server example using spring boot.

# Prereqisite
Java8
Maven

# Launch
Clean build the project using maven and start the application using spring boot app.
Execute below script for sample test on h2 database (http://localhost:8080/h2-console/login.do)

INSERT INTO user (id, username, password, age) VALUES (1, 'Ritesh', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 30);

Here password column keeps  encrypted value,current value is "password"


# Test
To get access token invoke (http://localhost:8080/oauth/token) in postman as post call with below information as request part
	Auhtorization -> select basic Auth and provide username as ritesh-client and password as ritesh-secret
	Body(x-www-form-urlencoded) -> username as Ritesh, password as password,grant_type as password

We will get the auth token ,now lets validate with oauth_token api
To validate access token launch (http://localhost:8080/oauth/check_token)
	Auhtorization -> select basic Auth and provide username as ritesh-client and password as ritesh-secret.
	Body(x-www-form-urlencoded) -> token as recieved token
	
Enjoy happy learning :)



