# Vehicle

## How to use the API?

* Through a POST request to the endpoint http://localhost:8080/vehicle you can send the next object to create a vehicle:

````
{
    "owner": {
        "documentTypeId": "1",
        "documentTypeName": "Cédula de ciudadanía",
        "document": "123456",
        "name": "Nombre propietario vehículo"
    },
    "driver": {
        "documentTypeId": "1",
        "documentTypeName": "Cédula de ciudadanía",
        "document": "987654",
        "name": "Nombre propietario vehículo"
    },
    "id": "AAA789"
}
````