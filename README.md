My Resume - Api REST
=====

1. Clone the project using `git clone https://github.com/resourcepool/https://github.com/TimLC/MyResume-Backend.git`

2. Import the project in Intellij IDEA and create a database using the following properties:
````
username: root
password: toor
database name: defaultdb
host: 192.168.99.100
````

3. Execute the following command with docker at the base of your repository to launch the DB:
```
docker run --name mariadb --rm -e MYSQL_ROOT_PASSWORD=toor -e MYSQL_DATABASE=defaultdb -p 3306:3306 -v "`pwd`/initdb:/docker-entrypoint-initdb.d" mariadb
```

4. All SQL scripts will be executed at the launch of the DB and will fill it.

5. Launch the application to launch the API.

6. Congratulations, you can now use the API.

7. To access the documentation with Swagger, go to: `localhost:8080/swagger-ui.html`
