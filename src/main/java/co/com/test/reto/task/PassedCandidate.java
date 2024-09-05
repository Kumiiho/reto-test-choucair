package co.com.test.reto.task;

import co.com.test.reto.userinterfaces.PassedInterview;
import co.com.test.reto.userinterfaces.ShortlistAccept;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PassedCandidate implements Task{
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PassedInterview.PASSEDBUTTON),
                Click.on(PassedInterview.SAVEBUTTON)
        );
    }
    public static PassedCandidate makeinformation () {
        return instrumented(PassedCandidate.class);
    }
}