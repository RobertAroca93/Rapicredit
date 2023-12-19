#language: es
#encoding: utf-8

Característica: Yo como usuario de rapicredit
  Quiero hacer login en la plataforma de rapiplazo
  Para ver la información de mi credito

  Escenario: Autenticación de usuario con credito activo
    Dado que el usuario se encuentra en el login unificado de rapicredit
    Cuando ingresa las credenciales correctamente
    Entonces el usuario de debe loguear exitosamente

    Escenario: Autenticación fallida de usuario con credito activo
      Dado que el usuario se encuentra en el login unificado de rapicredit
      Cuando ingresa las credenciales erroneamente
      Entonces el usuario No debe poder autenticarse