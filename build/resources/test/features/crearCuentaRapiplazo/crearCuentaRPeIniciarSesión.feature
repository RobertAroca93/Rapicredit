#language: es
#encoding: utf-8

Característica: Yo como usuario de rapicredit
  Quiero crear una solicitud exitosa en el onboarding de rapiplazo
  para poder ingresar a la plataforma y ver mi credito

  Escenario: crear una solicitud exitosa en rapiplazo e iniciar sesión
    Dado que realizo una solicitud exitosa en el onboarding de rapiplazo
    Cuando me autentico en el login unificado de rapicredit
    Entonces debo poder ver la información del credito