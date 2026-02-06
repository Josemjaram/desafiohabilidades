# API Registro de Estudiantes

Servicio web RESTful simple desarrollado con **Spring Boot** que permite registrar y listar estudiantes usando persistencia en memoria.

---

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Gradle
- Lombok

---

## Justificación tecnológica

Se eligió **Spring Boot** porque permite crear APIs REST de manera rápida, con mínima configuración y siguiendo buenas prácticas de arquitectura.

Se utilizó **Lombok** para reducir código repetitivo (getters, setters, constructores), permitiendo mayor productividad durante el desarrollo del desafío.

La persistencia se implementó **en memoria** mediante una lista, cumpliendo con el requerimiento de no usar bases de datos.

---

### Primero Clonar el repositorio

git clone <https://github.com/Josemjaram/desafiohabilidades.git>

---

###Segundo
cd demo

###Tercero

Mac:

./gradlew bootRun

Windows:

gradlew.bat bootRun

###Cuarto
En cmd: curl -X POST http://localhost:8080/estudiantes ^ -H "Content-Type: application/json" ^ -d "{\"id\":\"47\",\"nombre\":\"Roberto\",\"carrera\":\"Ingeniería Química\"}"

