package co.com.test.reto.task;

import co.com.test.reto.userinterfaces.CreateInterview;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;


import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScheduleInterview implements Task {
    String interviewTitle = "Entrevista tecnica";
    String nameInterviewer ="a";
    String dateInterviewer ="2024-20-09";

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateInterview.SCHEDULEBUTTON),
                Click.on(CreateInterview.TITLE),
                SendKeys.of(interviewTitle).into(CreateInterview.TITLE),
                SendKeys.of(nameInterviewer).into(CreateInterview.INTERVIEWER)

        );
        try {
            Thread.sleep(3000); // Espera de 5 segundos
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        actor.attemptsTo(
                Hit.the(Keys.ARROW_DOWN).into(CreateInterview.INTERVIEWER),
                Hit.the(Keys.ENTER).into(CreateInterview.INTERVIEWER),
                Click.on(CreateInterview.DATE),
                SendKeys.of(dateInterviewer).into(CreateInterview.DATE),
                Click.on(CreateInterview.DATE),
                Click.on(CreateInterview.SAVEBUTTON)
        );

    }
    public static ScheduleInterview makeinformation() {
        return instrumented(ScheduleInterview.class);
    }
}
