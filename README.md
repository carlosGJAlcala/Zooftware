

# Zooftware

**Descripción:**  
Zooftware es un sistema de gestión para zoológicos desarrollado como práctica final de la asignatura de Patrones de Diseño. El proyecto utiliza Spring para el backend y Thymeleaf para el frontend, proporcionando una aplicación web robusta y dinámica para la administración eficiente de un zoológico.

## Características

- **Gestión de Animales:** Registro y seguimiento de los animales, incluyendo detalles como especie, edad, salud y ubicación dentro del zoológico.
- **Control de Empleados:** Administración del personal, asignación de tareas y horarios de trabajo.
- **Planificación de Eventos:** Organización de eventos y actividades para visitantes, con opciones de programación y promoción.
- **Informes y Estadísticas:** Generación de reportes sobre la asistencia de visitantes, ventas y otros indicadores clave de rendimiento.

## Tecnologías Utilizadas

- **Backend:** Java con el framework Spring, que ofrece una estructura sólida para el desarrollo de aplicaciones empresariales.
- **Frontend:** Thymeleaf como motor de plantillas, facilitando la integración con Spring y la creación de vistas dinámicas.
- **Base de Datos:** Implementación de una base de datos relacional para el almacenamiento seguro y eficiente de la información.

## Instalación y Ejecución

Para poner en marcha Zooftware en tu entorno local, sigue estos pasos:

1. **Clona el repositorio:**

   ```bash
   git clone https://github.com/carlosGJAlcala/Zooftware.git
   ```

2. **Accede al directorio del proyecto:**

   ```bash
   cd Zooftware
   ```

3. **Configura la base de datos:**
   - Crea una base de datos en tu gestor preferido (por ejemplo, MySQL, PostgreSQL).
   - Actualiza las credenciales y la URL de conexión en el archivo `application.properties` ubicado en `src/main/resources/`.

4. **Compila y ejecuta la aplicación:**

   ```bash
   ./mvnw spring-boot:run
   ```

   Esto iniciará el servidor en `http://localhost:8080`.

## Contribuciones

Las contribuciones al proyecto son bienvenidas. Si deseas colaborar:

1. Realiza un fork del repositorio.
2. Crea una nueva rama para tus cambios.
3. Envía un pull request detallando las modificaciones propuestas.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Para más detalles, consulta el archivo `LICENSE` en el repositorio.

