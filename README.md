# Java Spring Market

## Descripción

El proyecto Java Spring Market es una aplicación desarrollada con Spring Boot que proporciona una API RESTful para la gestión de productos, compras y categorías dentro de un mercado. Utiliza Spring Data JPA para interactuar con la base de datos y MapStruct para el mapeo objeto-relacional.

## Cómo empezar

Para ejecutar este proyecto en tu entorno local, sigue estos pasos:

1. Clona el repositorio a tu máquina local.
2. Asegúrate de tener instalado Java JDK 11 o superior y Maven.
3. Navega hasta la carpeta del proyecto y ejecuta `mvn spring-boot:run` para iniciar la aplicación.
4. La aplicación estará disponible en `http://localhost:8090`.

## Estructura del código

La aplicación se estructura en los siguientes paquetes principales:

- `domain`: Contiene las clases de dominio y los servicios que definen la lógica de negocio.
- `persistence`: Se encarga de la persistencia de los datos, incluyendo las entidades y los repositorios.
- `controller`: Define los controladores de Spring MVC que manejan las solicitudes HTTP.

### Controladores

Los controladores principales son:

- `ProductController`: Gestiona las operaciones CRUD para los productos.
- `PurchaseController`: Maneja las operaciones relacionadas con las compras.

### Mapeadores

Los mapeadores de MapStruct se utilizan para convertir entre las entidades de persistencia y los objetos de dominio:

- `CategoryMapper`
- `ProductMapper`
- `PurchaseItemMapper`
- `PurchaseMapper`

## Cómo contribuir

Si estás interesado en contribuir al proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama para tu característica o corrección.
3. Implementa tus cambios.
4. Envía un pull request para que tus cambios sean considerados para la fusión con la rama principal.

Agradecemos tu interés en mejorar el proyecto Java Spring Market y esperamos tus contribuciones.
