package co.com.talenta365.certificacion.stepdefinitions;

import co.com.talenta365.certificacion.StepGeneral;
import co.com.talenta365.certificacion.questions.VerificarLoguinCorrecto;
import co.com.talenta365.certificacion.questions.VerificarProductoAgregado;
import co.com.talenta365.certificacion.tasks.AgregarProducto;
import co.com.talenta365.certificacion.tasks.Loguin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RealizarCasosPrueba extends StepGeneral {

    @Given("^Despues de ingresar a la url$")
    public void despuesDeIngresarALaUrl() {
        setUp();
    }


    @When("^procedo a ingresar usuario y clave$")
    public void procedoAIngresarUsuarioYClave(List<Map<String,String>> listaParamatrosDeIngreso) {
        theActorInTheSpotlight().attemptsTo(
                Loguin.conLaSigueienteCredenciales(
                        listaParamatrosDeIngreso.get(0).get("usuario"),
                        listaParamatrosDeIngreso.get(0).get("clave")));
    }

    @Then("^verifico que estoy logueado en la pagina$")
    public void verificoQueEstoyLogueadoEnLaPagina() {
        theActorInTheSpotlight().should(seeThat(VerificarLoguinCorrecto.conUsuario(theActorInTheSpotlight().recall("Usuario"))));
    }



    @Given("^Despues de encontrarme logueado en la pagina de advantageonlineshopping$")
    public void despuesDeEncontrarmeLogueadoEnLaPaginaDeAdvantageonlineshopping(List<Map<String,String>> listaParamatrosDeIngreso) {
        setUp();
        theActorInTheSpotlight().attemptsTo(
                Loguin.conLaSigueienteCredenciales(
                        listaParamatrosDeIngreso.get(0).get("usuario"),
                        listaParamatrosDeIngreso.get(0).get("clave")));
    }


    @When("^procedo a buscar el producto y lo agrego al carrito de compras$")
    public void procedoABuscarElProductoYLoAgregoAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(AgregarProducto.lapTop());
    }

    @Then("^se visualiza que fue agregado exitosamente con nombre$")
    public void seVisualizaQueFueAgregadoExitosamenteConNombre(List<Map<String,String>> nombreProducto) {
        theActorInTheSpotlight().should(seeThat(VerificarProductoAgregado.con(nombreProducto.get(0).get("nombreProducto"))));

    }


}
