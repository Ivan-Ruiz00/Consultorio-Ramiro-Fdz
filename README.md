# Consultorio-Ramiro-Fdz

---

### ¿Como correr el programa?
> 1. Posterior a clonar el repositorio en su ordenador, haga checkout en la rama master y luego haga clic derecho en el archivo "AppSistemaTransporteApplication".
> 2. Presione la opción Run.

### Desarrollo del proyecto
> 1. Reconocimiento de los requerimientos mínimos del código, como prohibiciones y estructura general
> 2. Leer a profundidad el ejercicio en busqueda de la estructura del programa
> 3. Identificación de servicios, repositorios, conexiones y modelos
> 4. Identificación características comunes para las interfaces
> 5. Identificación características comunes para las clases abstractas
> 6. Identificación de los endpoints y sus rutas
> 7. Definición controladores
> 8. Implementacion del código
> 9. Realización de pruebas del funcionamiento
> 10. Mantenimiento del código

### Estructura de las carpetas
> -Controller: Contiene el modelo y los controllers
> -Repository: Contiene el modelo y los repositorios
> -Service: Contiene el modelo y Service

## Documentación de la Api

--

### Mostrar Citas

|------------------------------------------|
|        URL        |        Método        |
|-------------------|----------------------|
| "api/v1/citas/all"|        "Get"         |
|------------------------------------------|

|------------------------------------------|

|--------------------------------------------------|
|          URL          |          Método          |
|-----------------------|--------------------------|
| "api/v1/citas/agendar |          "Post"          |
|--------------------------------------------------|

"JSON
{
    "duracion": "String",
    "horas":"String",
    "dia":"String",
    "descripcion":"String",
    "paciente":{
        "nombre":"String",
        "cedula":"String",
        "edad":int
    }
}"

### Eliminar Citas

|--------------------------------------------------|
|          URL          |          Método          |
|-----------------------|--------------------------|
| "api/v1/citas/borrar  |         "Delete"         |
|--------------------------------------------------|

"JSON
{
    "duracion":"String",
    "horas":"String",
    "dia":"String",
    "descripcion":"String",
    "paciente":{
        "nombre":"String",
        "cedula":"String",
        "edad":int
    }
}"

### Actualizar Citas

|---------------------------------------------------------------|
|                URL                |           Método          |
|-----------------------------------|---------------------------|
| "api/v1/citas/actualizar/{cedula} |           "Put"           |
|---------------------------------------------------------------|

"JSON
{
    "duracion":"String",
    "horas":"String",
    "dia":"String",
    "descripcion":"String",
    "paciente":{
        "nombre":"String",
        "cedula":"String",
        "edad":int
}

### Mostrar Historias

|----------------------------------------------------|
|           URL          |           Método          |
|------------------------|---------------------------|
| "api/v1/historias/all" |           "Get"           |
|----------------------------------------------------|

|----------------------------------------------------|

### Agregar Historia

|----------------------------------------------------------------------------------|
|                  URL                  |                  Método                  |
|---------------------------------------|------------------------------------------|
| "api/v1/historias/actualizar/{cedula} |                  "Post"                  |
|----------------------------------------------------------------------------------|

"JSON
{
  "historia":"String"
}"

### Eliminar Historia

|----------------------------------------------------------------------------------|
|                  URL                  |                  Método                  |
|---------------------------------------|------------------------------------------|
|  "api/v1/historias/eliminar/{cedula}  |                  "Delete"                  |
|----------------------------------------------------------------------------------|

|----------------------------------------------------------------------------------|

### Modificar Historia

|----------------------------------------------------------------------------------|
|                  URL                  |                  Método                  |
|---------------------------------------|------------------------------------------|
| "api/v1/historias/modificar/{cedula} |                 "Put"                   |
|----------------------------------------------------------------------------------|

"JSON
{
  "historia":"String"
}"

### Mostrar Pacientes

|----------------------------------------------------------------------------------|
|                  URL                  |                  Método                  |
|---------------------------------------|------------------------------------------|
|   "api/v1/pacientes/existentes/all    |                  "Get"                   |
|----------------------------------------------------------------------------------|

|----------------------------------------------------------------------------------|

### Agregar Paciente

|----------------------------------------------------------------------------------|
|                  URL                  |                  Método                  |
|---------------------------------------|------------------------------------------|
| "api/v1/pacientes/existentes/agregar  |                  "Post"                  |
|----------------------------------------------------------------------------------|

"JSON
{
    "nombre": "String",
    "cedula":"String",
    "edad":int
}"

### Modificar Paciente

|----------------------------------------------------------------------------------|
|                  URL                  |                  Método                  |
|---------------------------------------|------------------------------------------|
| "api/v1/pacientes/existentes/{cedula} |                  "Put"                   |
|----------------------------------------------------------------------------------|

"JSON
{
    "nombre": "String",
    "cedula":"String",
    "edad":int
}"

### Eliminar Paciente

|----------------------------------------------------------------------------------|
|                  URL                  |                  Método                  |
|---------------------------------------|------------------------------------------|
| "api/v1/pacientes/existentes/eliminar |                 "Delete"                 |
|----------------------------------------------------------------------------------|

"JSON
{
    "nombre": "String",
    "cedula":"String",
    "edad":int
}"

### Asignar Cita A Paciente Existente

|-------------------------------------------------------------------------------------------------------|
|                      URL                            |                     Método                      |
|-----------------------------------------------------|-------------------------------------------------|
| "api/v1/pacientes/existentes/agendar/citas/{cedula} |                    "Delete"                     |
|-------------------------------------------------------------------------------------------------------|

"JSON
{
    "duracion":"2",
    "horas":"12:00 - 14:00",
    "dia":"Lunes",
    "descripcion":"El paciente manifiesta constantes dolores en los huevos"
}"

### Patrones de diseño aplicados

> -Singleton por medio del Autowired de Springboot
> -Builder para facilidad al crear clases si se llega a necesitar dentro del código
