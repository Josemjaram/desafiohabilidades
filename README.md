# API Registro de Estudiantes

Servicio web RESTful desarrollado con Spring Boot que permite registrar y listar estudiantes utilizando persistencia en memoria.

Este proyecto fue realizado como parte del desafío de habilidades de programación y prácticas DevOps.

---

## Tecnologías utilizadas

* Java 21
* Spring Boot
* Gradle
* Lombok
* Git y GitHub
* GitHub Actions (CI Pipeline)

---

## Justificación tecnológica

Se eligió Spring Boot porque permite crear APIs REST de manera rápida, con mínima configuración y siguiendo buenas prácticas de arquitectura empresarial.

Se utilizó Lombok para reducir código repetitivo como getters, setters y constructores, mejorando la productividad durante el desarrollo.

La persistencia se implementó en memoria mediante listas, cumpliendo el requerimiento de no utilizar bases de datos externas.

---

# Cómo ejecutar el proyecto

## 1. Clonar el repositorio

```bash
git clone https://github.com/Josemjaram/desafiohabilidades.git
```

---

## 2. Entrar al proyecto

```bash
cd desafiohabilidades
```

---

## 3. Ejecutar la aplicación

### En Windows

```bash
gradlew.bat bootRun
```

### En Mac o Linux

```bash
./gradlew bootRun
```

---

## 4. Verificar que el servidor esté activo

Abrir en el navegador:

```
http://localhost:8080/estudiantes
```

---

# Endpoints disponibles

## 1. Registrar estudiante

Método: POST
Ruta: `/estudiantes`

Ejemplo con curl en Windows:

```bash
curl -X POST http://localhost:8080/estudiantes ^
-H "Content-Type: application/json" ^
-d "{\"id\":\"47\",\"nombre\":\"Vegeta\",\"carrera\":\"Ingeniería Química\"}"
```

Respuesta esperada:

```
201 Created
```

---

## 2. Listar estudiantes

Método: GET
Ruta: `/estudiantes`

En navegador o curl:

```
http://localhost:8080/estudiantes
```

Respuesta:

```json
[
  {
    "id": "47",
    "nombre": "Vegeta",
    "carrera": "Ingeniería Química"
  }
]
```

Código HTTP:

```
200 OK
```

---

# Estrategia de Git utilizada

Se utilizó la estrategia Trunk-Based Development.

## Justificación

* Permite integración continua frecuente.
* Reduce conflictos de merge.
* Facilita pipelines automáticos.
* Es ideal para proyectos pequeños o de corta duración.

## Implementación en el proyecto

* Rama principal: `main`
* Rama de desarrollo: `feature/api-estudiantes`
* Cambios integrados mediante Pull Request hacia `main`.

El historial de commits evidencia:

* Configuración de pipeline.
* Implementación de arquitectura MVC.
* Refactorizaciones.
* Correcciones de integración continua.

---

# Pipeline de Integración Continua

Se implementó integración continua usando GitHub Actions.

## Archivo de configuración

```
.github/workflows/ci.yml
```

---

## Flujo del pipeline

1. Checkout del repositorio.
2. Configuración de Java 21.
3. Asignación de permisos de ejecución a Gradle.
4. Compilación y build del proyecto.

---

## Herramientas utilizadas en el pipeline

| Herramienta       | Función              |
| ----------------- | -------------------- |
| GitHub Actions    | Automatización de CI |
| Gradle Wrapper    | Build del proyecto   |
| Setup Java Action | Instalación de JDK   |
| Ubuntu Runner     | Entorno de ejecución |

---

## Ejecución automática

El pipeline se ejecuta en cada:

* Push al repositorio.
* Pull Request hacia la rama principal.

Esto garantiza que el proyecto compile correctamente antes de integrarse a `main`.

---

# Arquitectura del proyecto

Se implementó el patrón MVC:

* Controller: Exposición de endpoints REST.
* Service: Lógica de negocio.
* Repository: Persistencia en memoria.
* Model: Entidad Estudiante.

---

# Persistencia de datos

La persistencia se maneja en memoria mediante listas.

Los datos se pierden al reiniciar el servidor, tal como lo establecen los requerimientos del desafío.

---

# Autor

Jose Miguel Jaramillo Zuluaga
Proyecto académico – Desafío de habilidades DevOps y Backend.
