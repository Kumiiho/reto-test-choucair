# Autor: Andres Felipe Vargas
# language: es

  Requisito: Contratar a un empleado
  Como usuario administrador se desea crear y contratar un empleado en la plataforma OrangeHRM

    Escenario: Iniciar sesion con las credenciales correctas

      Dado Que el usuario se encuentra en la pantalla principal de login
      Cuando El usuario realiza un inicio de sesion exitoso
      Y Desea registrar un nuevo candidato con las credenciales necesarias
      Y Lo avanza a la lista de los finalistas
      Y Se quiere programar una entrevista con titulo, fecha y hora
      Y Se da como aprobado en la entrevista
      Y Se le ofrece trabajo
      Entonces El usuario es contratado comprobandose su datos

