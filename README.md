# Desafio Foro Hub Alura
Desarollo de aplicacion para gestionar un foro aplicando buenas practicas, ademas de implementacion de Spring Security JWT

<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" height="60" alt="java logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" height="60" alt="spring logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/postgresql/postgresql-original.svg" height="60" alt="postgresql logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/insomnia/insomnia-original.svg" height="60" alt="insomnia logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/intellij/intellij-original.svg" height="60" alt="intellij logo"  />
  <img width="12" />
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/github/github-original.svg" height="60" alt="github logo"  />
</div>


###

<h2>Primeros pasos</h2>

###

<p>Creación del proyecto con Spring initializr. Donde agregamos las dependencias del proyecto:<br><br>- Spring Web<br>- Spring Dev tools<br>- Spring Data JPA<br>- Flyway<br>- FlywayPostgres<br>- Postgres DB<br>- Spring Security<br>- JWT <br>- Spring Validation</p>

###

<h2>Configuraciones para la conexion a la base de datos</h2>

###

<p>Agregamos los datos base de:<br>- Url a la base de datos<br>- Usuario<br>- Contrasenia<br>- El Driver de conexion( cada gestor de base de datos maneja distinto esta parte) en este caso se configuro para postgresql</p>

###

<h2>Organizacion de los directorios</h2>

###

<p>En la carpeta principal se desgloza:<br>- Controller: para las clases controladoras de cada entidad y autenticacion.<br>- Dominio:  y subdirectorio por cada clase entidad.<br>- Infra: para el control de excepciones y configuraciones de Spring Security.<br>- Resources: para almacenar los archivos de propiedades y un subdirectorio para almacenar las migraciones de Flyway.</p>

###

<h2>Funcionamiento</h2>

###

<p>El usuario de la aplicacion debe iniciar en la ruta "/login" para poder generar un token que servira para poder acceder a las demas partes del sistema.<br><br>Una vez generado la aplicación hará validaciones necesarios para verificar la validez del token y tiempo de expiración. <br><br>En cuanto a los Topicos se creo un CRUD. Para ingresar a este el usuario debe ingresar a la ruta "/topicos", previmente habiendo ingresado a "/login"para generar el token de seguridad.</p>

###
