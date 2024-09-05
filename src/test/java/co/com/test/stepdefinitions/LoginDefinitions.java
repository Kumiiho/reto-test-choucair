package co.com.test.stepdefinitions;

import co.com.test.reto.task.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginDefinitions {



    @Managed(driver = "chrome")
    WebDriver Driver;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Felipe");
        theActorInTheSpotlight().wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));

    }

    @Dado("Que el usuario se encuentra en la pantalla principal de login")
    public void queElUsuarioSeEncuentraEnLaPantallaPrincipalDeLogin() {
    }
    @Cuando("El usuario realiza un inicio de sesion exitoso")
    public void elUsuarioRealizaUnInicioDeSesionExitoso() {

        theActorInTheSpotlight().attemptsTo(LoginUser.makeinformation());
    }
    @Cuando("Desea registrar un nuevo candidato con las credenciales necesarias")
    public void deseaRegistrarUnNuevoCandidatoConLasCredencialesNecesarias() {

        theActorInTheSpotlight().attemptsTo(CreateCandidate.makeinformation());

    }
    @Cuando("Lo avanza a la lista de los finalistas")
    public void loAvanzaALaListaDeLosFinalistas() {

        theActorInTheSpotlight().attemptsTo(FinalistCandidate.makeinformation());
    }
    @Cuando("Se quiere programar una entrevista con titulo, fecha y hora")
    public void seQuiereProgramarUnaEntrevistaConTituloFechaYHora() {
        theActorInTheSpotlight().attemptsTo(ScheduleInterview.makeinformation());

    }
    @Cuando("Se da como aprobado en la entrevista")
    public void seDaComoAprobadoEnLaEntrevista() {
        theActorInTheSpotlight().attemptsTo(PassedCandidate.makeinformation());
    }
    @Cuando("Se le ofrece trabajo")
    public void seLeOfreceTrabajo() {
        theActorInTheSpotlight().attemptsTo(AcceptJob.makeinformation());

    }
    @Entonces("El usuario es contratado comprobandose su datos")
    public void elUsuarioEsContratadoComprobandoseSuDatos() {
        theActorInTheSpotlight().attemptsTo(HireCandidate.makeinformation());

    }

}
