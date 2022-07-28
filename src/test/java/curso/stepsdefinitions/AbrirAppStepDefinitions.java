package curso.stepsdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import tasks.AbreLaApp;
import tasks.LlegarAMenuPrincipal;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AbrirAppStepDefinitions {

    @Given("^que (.*) abre la app de Misurtii$")
    public void queJuanAbreLaAppDeMisurtii(String juan) {
        theActorCalled(juan).wasAbleTo(AbreLaApp.deMiSurtii());
        //theActorCalled(juan).wasAbleTo(AbreElNavegador.delCelular());
    }

    @When("^entra hasta la pestalla de views$")
    public void entraHastaLaPestallaDeViews() {
        theActorInTheSpotlight().attemptsTo(LlegarAMenuPrincipal.paraProbar());

    }

}