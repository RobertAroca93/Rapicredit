#language: es
#encoding: utf-8

Característica: yo como usuario de rapicredit
  quiero ingresar al login desde los enlaces del onboarding
  para poder autenticarme

  Escenario: Ingresar al login unificado desde el enlace de Tyc en el onboarding de Rapiplazo
    Dado que me encuentro en el onboarding de rapiplazo
    Cuando ingreso al enlace de terminos y condiciones
    Y me dirijo al login
    Entonces se debe mostrar el login unificado

  Escenario:Ingresar al login unificado desde el enlace de la politica de protección de datos en el onboarding de Rapiplazo
    Dado que estoy en el onboarding de rapiplazo
    Cuando ingreso al enlace de politica de protección de datos
    Y me quiero dirigir al login
    Entonces se deberá mostrar el login unificado

  Escenario: Ingresar al login unificado desde el enlace de autorización de datos en el onboarding de Rapiplazo
    Dado que me dirijo al onboarding de rapiplazo
    Cuando ingreso en el enlace de autorización de datos
    Y deseo ingresar dirigir al login
    Entonces se deberá mostrar el login de rapicredit