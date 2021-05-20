package com.aviaca.qa.stepsdefinitions;

import com.avianca.qa.models.ReservaModel;
import com.avianca.qa.questions.InformacionVuelo;
import com.avianca.qa.tasks.Reservar;
import com.avianca.qa.userinterfaces.SeleccionVueloUI;
import com.avianca.qa.utils.Ambientes;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.hamcrest.Matchers;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ReservaStepdefs {
    @Before
    public void setUp()  {
        Stage stage = OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el esta en la pagina de inicio$")
    public void elEstaEnLaPaginaDeInicio() {
        theActorCalled("Juan").
                attemptsTo(Open.url(Ambientes.URL_PRODUCCION));
    }

    @When("^el registra los datos de la reserva$")
    public void elRegistraLosDatosDeLaReserva(List<ReservaModel> datosReserva) {
        theActorInTheSpotlight().attemptsTo(
                Reservar.soloIda(datosReserva.get(0))
        );
    }

    @Then("^el deberia poder ver los precios en el panel superior$")
    public void elDeberiaPoderVerLosPreciosEnElPanelSuperior() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(SeleccionVueloUI.BOTON_VUELO_HOY_VALOR,isClickable()).forNoMoreThan(10).seconds()
        );
        theActorInTheSpotlight().should(
                seeThat(InformacionVuelo.menuSuperior(), Matchers.is(true))
        );

    }
}
