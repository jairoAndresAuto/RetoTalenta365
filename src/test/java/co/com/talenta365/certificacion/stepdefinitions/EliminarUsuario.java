package co.com.talenta365.certificacion.stepdefinitions;

import co.com.talenta365.certificacion.StepGeneral;
import co.com.talenta365.certificacion.tasks.Loguin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarUsuario extends StepGeneral {

    @Given("^Despues de ingresar a la url y loguearme$")
    public void despuesDeIngresarALaUrlYLoguearme(List<Map<String,String>> credenciales) {
        setUp();
        theActorInTheSpotlight().attemptsTo(
                Loguin.conLaSigueienteCredenciales(
                        credenciales.get(0).get("usuario"),
                        credenciales.get(0).get("clave")));
    }


    @When("^procedo a ingresar a la opcion mi cuenta y procedo a eliminar el usuario$")
    public void procedoAIngresarALaOpcionMiCuentaYProcedoAEliminarElUsuario() {
        theActorInTheSpotlight().attemptsTo(co.com.talenta365.certificacion.tasks.EliminarUsuario.con());
    }

    @Then("^verifico que este eliminado correctamente$")
    public void verificoQueEsteEliminadoCorrectamente() {
    }
}
