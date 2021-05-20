Feature: Validacion de reservas en la pagina web de Avianca
  Como visitante
  Yo quiero ingresar a la pagina web de Avianca
  Para realizar reservas de mis viajes

  @reservaSoloIda
  Scenario: Validar precios en reserva solo ida
    Given el esta en la pagina de inicio
    When el registra los datos de la reserva
      | desde    | hacia   | adultos   | ninios | bebes|
      | Medellin | Bogota  |    2      |   1    | 1    |
    Then el deberia poder ver los precios en el panel superior

