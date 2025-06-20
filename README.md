# ApiProductosv1

ApiProductosv1 es un proyecto desarrollado en Java utilizando Spring Boot, diseñado como una API para la gestión de productos. Este proyecto sirve como base para la creación y consulta de productos almacenados en base de datos, ideal para integraciones y desarrollos de sistemas de inventario, comercio electrónico o cualquier solución que requiera gestión de productos vía REST API.

## Características

- **Desarrollado con Java 21 y Spring Boot 3.2.5**
- Arquitectura RESTful para manejo de productos.
- Persistencia de datos usando Spring Data JPA.
- Base de datos en memoria H2 para pruebas y desarrollo.
- Uso de Lombok para reducir el código repetitivo.
- Documentación interactiva de la API con Swagger/OpenAPI (springdoc-openapi).
- Pruebas unitarias y de integración con Spring Boot Test.

## Instalación

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/jonhsolarte/ApiProductosv1.git
   cd ApiProductosv1
   ```

2. **Construye el proyecto con Maven:**
   ```bash
   mvn clean install
   ```

3. **Ejecuta la aplicación:**
   ```bash
   mvn spring-boot:run
   ```

La API estará disponible en `http://localhost:8080/`.

## Documentación de la API

Una vez levantado el proyecto, puedes acceder a la documentación interactiva generada automáticamente por Swagger/OpenAPI en:

```
http://localhost:8080/swagger-ui.html
```
o
```
http://localhost:8080/swagger-ui/index.html
```

## Dependencias principales

- `spring-boot-starter-web`: Para exponer los endpoints REST.
- `spring-boot-starter-data-jpa`: Persistencia de datos.
- `com.h2database:h2`: Base de datos en memoria.
- `org.projectlombok:lombok`: Utilidades para simplificar el código Java.
- `springdoc-openapi-starter-webmvc-ui`: Documentación de la API.
- `spring-boot-starter-test`: Pruebas automatizadas.

## Estructura del Proyecto

- `/src/main/java`: Código fuente Java de la API.
- `/src/main/resources`: Configuraciones y recursos.
- `pom.xml`: Archivo de configuración de dependencias Maven.

## Contribuciones

Las contribuciones son bienvenidas. Siéntete libre de abrir issues o pull requests.

## Licencia

Este proyecto no tiene una licencia especificada. Si deseas usarlo en proyectos comerciales o de código abierto, por favor consulta con el autor.

---

Desarrollado por [jonhsolarte](https://github.com/jonhsolarte)
