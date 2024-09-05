package co.com.test.reto.task;

import co.com.test.reto.userinterfaces.OfferJob;
import co.com.test.reto.userinterfaces.PassedInterview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AcceptJob implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OfferJob.OFFERBUTTON),
                Click.on(OfferJob.SAVEBUTTON)
        );
    }
    public static AcceptJob makeinformation () {
        return instrumented(AcceptJob.class);
    }
}