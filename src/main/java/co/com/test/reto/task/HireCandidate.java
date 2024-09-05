package co.com.test.reto.task;

import co.com.test.reto.userinterfaces.Hire;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class HireCandidate implements Task {
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Hire.HIREBUTTON),
                Click.on(Hire.SAVEBUTTON)
        );
    }

    public static HireCandidate makeinformation() {
        return instrumented (HireCandidate.class);
    }
}
