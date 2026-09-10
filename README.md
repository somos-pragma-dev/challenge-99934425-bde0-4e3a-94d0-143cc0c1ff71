# Implementación de autenticación JWT en una API REST

El equipo de desarrollo de una plataforma fintech necesita implementar un sistema de autenticación seguro para una API REST utilizando JWT. La plataforma gestiona transacciones financieras y requiere un alto nivel de seguridad para proteger la información sensible de los usuarios. Debes diseñar un sistema de autenticación que garantice la integridad y confidencialidad de los datos, manejando correctamente la emisión, verificación y renovación de tokens JWT.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Java Spring Boot Security |
| **Nivel** | junior-l1 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Diseño del sistema de autenticación

**Objetivo:** Definir la estructura y los componentes necesarios para el sistema de autenticación JWT.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identificar los actores involucrados en el proceso de autenticación (usuario, servicio de autenticación, API protegida).
- Establecer las reglas de negocio para la emisión y verificación de tokens JWT.
- Definir los umbrales de seguridad y las políticas de renovación de tokens.

**Entregable:** Diagrama de componentes y reglas de negocio para la autenticación JWT.

<details>
<summary>Pistas de conocimiento</summary>

- Considera la duración del token y la frecuencia de renovación.
- Piensa en los posibles ataques y cómo mitigarlos.

</details>

### Fase 2: Implementación de la emisión de tokens

**Objetivo:** Desarrollar el servicio responsable de emitir tokens JWT al recibir credenciales válidas.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Crear un servicio que acepte credenciales de usuario y emita un token JWT si las credenciales son válidas.
- Implementar la lógica para firmar y generar el token JWT.
- Establecer la duración del token y las políticas de renovación.

**Entregable:** Servicio de emisión de tokens JWT funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza una clave secreta para firmar el token.
- Considera la expiración del token y la posibilidad de renovación.

</details>

### Fase 3: Integración y verificación de tokens en la API

**Objetivo:** Integrar el sistema de autenticación JWT en la API REST y verificar los tokens en cada solicitud.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Modificar la API REST para requerir un token JWT en las solicitudes protegidas.
- Implementar un filtro que verifique la validez del token JWT en cada solicitud.
- Manejar los casos de token expirado o inválido.

**Entregable:** API REST protegida con autenticación JWT funcional.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza un filtro para interceptar y verificar los tokens en las solicitudes.
- Considera la lógica para manejar tokens expirados o inválidos.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un token JWT y para qué se utiliza en la autenticación de una API REST?
- **paraQueSirve**: ¿Cómo se utiliza un token JWT para proteger una API REST y garantizar la integridad y confidencialidad de los datos?
- **comoSeUsa**: ¿Cómo se implementa la emisión y verificación de tokens JWT en una API REST?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar un sistema de autenticación JWT y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones de diseño y seguridad implica la implementación de un sistema de autenticación JWT en una API REST?

## Criterios de Evaluacion

- Definición clara de los actores y reglas de negocio para la autenticación JWT.
- Implementación funcional del servicio de emisión de tokens JWT.
- Integración y verificación exitosa de tokens JWT en la API REST.
- Manejo adecuado de errores y casos de token expirado o inválido.
- Decisiones de diseño y seguridad justificadas y documentadas.

## Como trabajar con un asistente de IA

- **AGENTS.md** — instrucciones nativas del repo (Cursor, Codex, Copilot, Gemini, Claude Code). Abrí el proyecto y el agente las carga solo.
- **PROMPT_MEJORA.md** — el mismo prompt, para copiar y pegar en un chat (claude.ai, ChatGPT, etc.).

---

*Reto generado automaticamente por Challenge Generator - Pragma*
