Simple sweater that has the teams by division (NFC/AFC)

:Web: http://localhost:8080/
:Download: https://github.com/pshynin/nfld

Easy to check the health of the app::

    $ curl localhost:8080/actuator/health
    {"status":"UP"}

Registration::

    curl -X PUT https://api.nfl.com/v1/users \
    -H 'Authorization: Bearer ${access_token}' \
    -H 'Content-Type: application/json' \
    -d '{
    "username":"${username}",
    "password":"${password}",
    "firstName":"${first_name}",
    "lastName":"${last_name}",
    "emailAddress":"${email}",
    "birthDay" : ${birth_day},
    "birthMonth" : ${birth_month},
    "birthYear" : ${birth_year},
    "optIn" : "true/false",
    "tos" : true/false,
    }

Setup Database::

    docker run --name pg_webapp -e POSTGRES_PASSWORD=secret -d -p 5400:5432 postgres

    docker exec -it pg_webapp bash

    psql -U postgres

