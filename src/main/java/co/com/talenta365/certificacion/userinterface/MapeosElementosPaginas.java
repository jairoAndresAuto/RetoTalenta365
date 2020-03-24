package co.com.talenta365.certificacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MapeosElementosPaginas {

    public static Target BTN_LOGUEO=Target.the("Dar clic en el boton de logueo").located(By.id("hrefUserIcon"));
    public static Target TXT_USUARIO=Target.the("Ingresar usuario").located(By.name("username"));
    public static Target TXT_CLAVE=Target.the("Ingresar clave").located(By.name("password"));
    public static Target CONTENEDOR=Target.the("Esperar contenedor").located(By.xpath("//div[@class='container ']"));
    public static Target BTN_INGRESAR=Target.the("Clic en el boton ingresar").located(By.xpath("//button[contains(text(),'SIGN IN')]"));
    public static Target LBL_NOMBRE_USUARIO=Target.the("etiqueta nombre de usuario").located(By.xpath("(//span[contains(text(),'carlos')])[2]"));
    public static Target SELECCIONAR_PRODUCTO=Target.the("Seleccionar laptop").located(By.xpath("//*[@id='popular_items']/div/div[2]/figure/img"));
    public static Target PRODUCTO=Target.the("Seleccionar laptop").located(By.xpath("//*[@id='popular_items']/div/div[2]/a"));
    public static Target BTN_AGREGAR=Target.the("agregar al carrito").located(By.xpath("//button[@name='save_to_cart']"));
    public static Target NOMBRE_PRODUCTO=Target.the("Nombre producto").located(By.xpath("(//h1[contains(text(),'HP')])[2]"));
    public static Target LBL_PRODUCTO_AGREGADO=Target.the("Etiqueta nombre producto agreado").located(By.xpath("(//h3[contains(text(),'HP CHROMEBOOK 14 G1(ES)')])[1]"));
    public static Target BTN_USUARIO_LOGUEADO=Target.the("Menu usuario").located(By.xpath("//*[@id='menuUser']"));
    public static Target BTN_OPCION_MI_CUENTA=Target.the("opcion mi cuenta").located(By.xpath("(//label[contains(text(),'My account')])[2]"));
    public static Target LBL_MI_CUENTA=Target.the("opcion mi cuenta").located(By.xpath("//h3[contains(text(),'MY ACCOUNT')]"));
    public static Target BTN_ELIMINAR=Target.the("btn eliminar cuenta").located(By.xpath("//button[@class='deleteMainBtnContainer a-button ng-scope']"));
    public static Target CONTENEDOR_POPUP_ELIMINAR=Target.the("btn eliminar cuenta").located(By.id("deleteAccountPopup"));
    public static Target CONTENEDOR_POPUP_YES=Target.the("btn eliminar cuenta").located(By.xpath("//div[@class='deletePopupBtn deleteRed']"));







}
