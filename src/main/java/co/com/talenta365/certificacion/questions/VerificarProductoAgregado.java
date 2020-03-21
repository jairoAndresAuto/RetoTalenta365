package co.com.talenta365.certificacion.questions;

import co.com.talenta365.certificacion.userinterface.MapeosElementosPaginas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarProductoAgregado implements Question<Boolean> {

    String nombreProducto;

    public VerificarProductoAgregado(String nombreProducto) {
        this.nombreProducto= nombreProducto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(Click.on(MapeosElementosPaginas.BTN_AGREGAR));
        return Text.of(MapeosElementosPaginas.LBL_PRODUCTO_AGREGADO).viewedBy(actor).asString().equals(nombreProducto);
    }

    public static VerificarProductoAgregado con(String nombreProducto) {
        return new VerificarProductoAgregado(nombreProducto);
    }
}
