package co.com.talenta365.certificacion.tasks;


import co.com.talenta365.certificacion.userinterface.MapeosElementosPaginas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class EliminarUsuario implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(MapeosElementosPaginas.CONTENEDOR, isVisible()),
                        Click.on(MapeosElementosPaginas.BTN_USUARIO_LOGUEADO),
                        Click.on(MapeosElementosPaginas.BTN_OPCION_MI_CUENTA),
                        WaitUntil.the(MapeosElementosPaginas.LBL_MI_CUENTA, isVisible()),
                        Scroll.to(MapeosElementosPaginas.BTN_ELIMINAR),
                        Click.on(MapeosElementosPaginas.BTN_ELIMINAR),
                        WaitUntil.the(MapeosElementosPaginas.CONTENEDOR_POPUP_ELIMINAR, isVisible()),
                        Click.on(MapeosElementosPaginas.CONTENEDOR_POPUP_YES));
        try{
            Thread.sleep(2000);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public static EliminarUsuario con(){
        return Tasks.instrumented(EliminarUsuario.class);
    }
}
