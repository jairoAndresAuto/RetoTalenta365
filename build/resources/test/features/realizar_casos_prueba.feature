Feature: Realizar compra en la pagina advantageonlineshopping

  @Loguearme
  Scenario: Loguearme en la pagina advantageonlineshopping
    Given Despues de ingresar a la url
    When procedo a ingresar usuario y clave
      |usuario|clave|
      |   carlos1992 | Carlos123.|
    Then  verifico que estoy logueado en la pagina

  @Agregar
  Scenario: Agregar Producto
    Given Despues de encontrarme logueado en la pagina de advantageonlineshopping
      |usuario|clave|
      |   carlos1992 | Carlos123.|
    When procedo a buscar el producto y lo agrego al carrito de compras
    Then se visualiza que fue agregado exitosamente con nombre
    |nombreProducto|
    |   HP CHROMEBOOK 14 G1(ES)           |
