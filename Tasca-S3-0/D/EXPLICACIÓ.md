1-El problema principal era que ServicePerson (lógica del negocio) dependia directamente de la clase MySql (detalle técnico).

2-Incumplia el principio de DIP dado que un módulo de alto nivel dependia de uno de bajo nivel, eso hacia que:
    * No se pudiera cambiar la base de datos sin modificar el servicio.
    * No puedas testear el servicio sin MySql.
    * El código sea rígido y poco extensible, por ejemplo a implementar otro detalle técnico como mongo db.
    * No había ninguna abstracción de manera que todo estaba conectado directamente a una implementación concreta.

3-Las soluciones aplicadas han sido:
    * Crear una interfície donde se crea la abstracción que dice que hay que hacer. (PersonRegistration).
    * Hacer que MySql implemente la interfície, de esta forma MySql es substituible.
    * Modificar ServicePerson para que dependa de la interfície, ahora en vez de hacer: new MySql(), hacemos: new ServicePerson(new MySql());
    así inyectamos la dependencia.
    * Antes: ServicePerson -> MySql.
      Ahora: ServicePersona -> PersonRegistration <- MySql.
    
  4-Hacemos todo esto porque:
    * Desacoplamos la lógica del negocio de los detalles técnicos.
    * Permitimos substituir MySql por otro servicio o fichero.
    * Facilita los test.
    * Sigue les principios de DIP, OCP i SRP.
    * Hace el código más limpio, ordenado i extensible que es lo que se pedía justamente en el ejercicio.
    
