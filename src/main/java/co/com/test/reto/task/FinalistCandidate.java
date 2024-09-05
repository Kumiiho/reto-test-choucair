package co.com.test.reto.task;

import co.com.test.reto.userinterfaces.AccessPlattformRecruitment;
import co.com.test.reto.userinterfaces.CandidateData;
import co.com.test.reto.userinterfaces.ShortlistAccept;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FinalistCandidate implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShortlistAccept.SHORTLISTBUTTON),
                Click.on(ShortlistAccept.SAVEBUTTON)
        );

        }

        public static FinalistCandidate makeinformation () {
            return instrumented(FinalistCandidate.class);
        }
    }