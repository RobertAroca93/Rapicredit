#language: es
#encoding: utf-8

Característica: yo como usuario de rapicredit
  quiero ingresar al login desde la pagina de terminos y condiciones
  para poder autenticarme

  Esquema del escenario: Realizar la redirección al login desde los enlaces que se muestran en el onboarding
    Dado que el usuario se encuentra en el onboarding de rapiplazo
    Cuando da clic en el enlace de <tipoDeEnlace>
    Entonces el sistema lo debe redireccionar a la landing correspondiente
    Ejemplos:
      | tipoDeEnlace                     |
      | terminos y condiciones           |
      | autorización de datos personales |
      | politica de tratamiento de datos |

