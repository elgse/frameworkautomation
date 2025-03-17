Feature: Se realizan pruebas iniciales para crear un framework automatizado de pruebas

  Scenario: Se realizara login correcto
    Given Abro la pagina a probar
    When Ingreso mi usuario y contraseña
    Then Me logueo correctamente

  Scenario: Se realizara un login incorrecto
    Given Abro la pagina a probar
    When Ingreso mi usuario y contraseña
    Then Veo mensaje de error en el login