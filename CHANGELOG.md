# Changelog

Todas las modificaciones notables en este proyecto serán documentadas en este archivo.

## [0.2.0] - 2025-06-11

### Añadido

- Funcionalidad para crear publicaciones:

  - Endpoint: `POST /api/publications`
  - Permite agregar una nueva publicación con campos validados.

- Funcionalidad para actualizar publicaciones:

  - Endpoint: `PUT /api/publications/{id}`
  - Permite modificar el contenido de una publicación existente por ID.

- Funcionalidad para eliminar publicaciones:
  - Endpoint: `DELETE /api/publications/{id}`
  - Permite eliminar una publicación específica por ID.

## [0.1.1] - 2025-06-11

### Corregido

- Se solucionó un error crítico que impedía el correcto funcionamiento del sistema de login.

## [0.1.0] - 2025-06-11

### Añadido

- Funcionalidad para obtener todas las publicaciones.
  - Endpoint: `/api/publications`
  - Responde con una lista paginada de todas las publicaciones disponibles.

---

## [0.0.1] - 2025-05-11

### Añadido

- Estructura inicial del proyecto.
- Configuración básica de GitFlow.
