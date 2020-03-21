package co.com.talenta365.certificacion.tasks;

import co.com.talenta365.certificacion.questions.VerificarLoguinCorrecto;
import co.com.talenta365.certificacion.userinterface.MapeosElementosPaginas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        theActorInTheSpotlight().should(seeThat(VerificarLoguinCorrecto.conUsuario(theActorInTheSpotlight().recall("Usuario"))));
        actor.attemptsTo(Scroll.to(MapeosElementosPaginas.SELECCIONAR_PRODUCTO),
                Click.on(MapeosElementosPaginas.PRODUCTO),
                WaitUntil.the(MapeosElementosPaginas.NOMBRE_PRODUCTO, isVisible()),
                Click.on(MapeosElementosPaginas.BTN_AGREGAR));

        try{
            Thread.sleep(5000);
        }catch (Exception e){
            e.getMessage();
        }
    }

    public static AgregarProducto lapTop(){
        return Tasks.instrumented(AgregarProducto.class);
    }
}
