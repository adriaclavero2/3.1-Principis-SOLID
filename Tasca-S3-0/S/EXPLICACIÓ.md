1- Lo que estaba mal en la versión original es que User hacía muchas cosas:
    * Validar el email.
    * Validar la contraseña.
    * Mandar un correo de confirmación.
    * Gestionar la confirmación de usuario.
    * Guardar los datos.
  - Por lo que era difícil de mantener y ampliar, tenía las responsabilidades mezcladas y era difícil de testear (tenías que mandar emails para probar la           lógica).

2- Incumplia el Single Responsability Principle justamente por que la clase tenía más de una responsabilidad.
 - También incumplia DIP porque User dependia de de la validación del emial, la validación de la contraseña y el envío del email.
 - No dependia de ninguna abstracción.
 - Incumplia OCP debido a que si querias canviar la validación, canviar el sistema de emails o añadir otro tipo de registro tenías que modificar User, que en     un caso correcto esta clase debería estar cerrada a modificaciones.

3- La solución ha sido crear interfícies para cada responsabilidad, EmailRegistration y PasswordRegistration. Creando abstracciones que es lo que DIP pide.
 - Crear implementaciones separadas, ImplEmailRegistration e ImplPasswordRegistration, cada una hace una cosa cumpliendo con SRP.
 - Crear un servicio de registro que cordina las operaciones (UserRegistrationService):
     * Recibe las dependencias del constructor.
     * Valida el email.
     * Valida la contraseña.
     * Simula la confirmación.
     * Registra al usuario.
  - En el Main inyectamos las dependencias UserRegistrationService service = new UserRegistrationService(emailReg, passReg);
    Eso permite:
                * Cambiar implementaciones sin tocar el servicio.
                * Hacer tests.
                * Hcer nuevas validaciones sin reescribir nada.
