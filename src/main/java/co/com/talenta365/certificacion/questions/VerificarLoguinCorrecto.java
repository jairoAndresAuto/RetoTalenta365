package co.com.talenta365.certificacion.questions;

import co.com.talenta365.certificacion.userinterface.MapeosElementosPaginas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarLoguinCorrecto implements Question<Boolean> {

    private String nombreuser;

    public VerificarLoguinCorrecto(String nombreuser) {
        this.nombreuser = nombreuser;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(MapeosElementosPaginas.LBL_NOMBRE_USUARIO).viewedBy(actor).asString().equals(nombreuser);
    }

    public static VerificarLoguinCorrecto conUsuario(String nombreuser) {
        return new VerificarLoguinCorrecto(nombreuser);
    }
}
