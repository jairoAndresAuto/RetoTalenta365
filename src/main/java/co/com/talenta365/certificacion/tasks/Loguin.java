package co.com.talenta365.certificacion.tasks;

import co.com.talenta365.certificacion.userinterface.MapeosElementosPaginas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Loguin implements Task {

    private String user;
    private  String clave;

    public Loguin(String user, String clave) {
        this.user = user;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(WaitUntil.the(MapeosElementosPaginas.CONTENEDOR, isVisible()),
               Click.on(MapeosElementosPaginas.BTN_LOGUEO),
               Enter.theValue(user).into(MapeosElementosPaginas.TXT_USUARIO),
               Enter.theValue(clave).into(MapeosElementosPaginas.TXT_CLAVE),
               Click.on(MapeosElementosPaginas.BTN_INGRESAR),
               WaitUntil.the(MapeosElementosPaginas.LBL_NOMBRE_USUARIO, isVisible()));
       actor.remember("Usuario",user);
    }

    public static Loguin conLaSigueienteCredenciales(String user, String clave){
        return Tasks.instrumented(Loguin.class,user,clave);
    }
}
