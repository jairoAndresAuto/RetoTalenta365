Feature: Dar de baja el usuario

  @Loguearme
  Scenario: Loguearme en la pagina advantageonlineshopping
    Given Despues de ingresar a la url y loguearme
      |usuario|clave|
      |   carlos1992 | Carlos123.|
    When procedo a ingresar a la opcion mi cuenta y procedo a eliminar el usuario
    Then  verifico que este eliminado correctamente