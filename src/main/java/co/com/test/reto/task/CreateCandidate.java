package co.com.test.reto.task;

import co.com.test.reto.userinterfaces.AccessPlattformRecruitment;
import co.com.test.reto.userinterfaces.CandidateData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CreateCandidate implements Task {
    String fName="Felipe";
    String mName="Albert";
    String lName="Test";
    String email="test@test.com";


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(AccessPlattformRecruitment.RECRUITMENTBUTTON),
                Click.on(AccessPlattformRecruitment.ADDBUTTON),
                SendKeys.of(fName).into(CandidateData.FIRSTNAME),
                SendKeys.of(mName).into(CandidateData.MIDDLENAME),
                SendKeys.of(lName).into(CandidateData.LASTNAME),
                Click.on(CandidateData.VACANCYSELECT),
                SendKeys.of("p").into(CandidateData.VACANCYCORRECT),
                Hit.the(Keys.ENTER).into(CandidateData.VACANCYCORRECT),
                Click.on(CandidateData.VACANCYSELECT),
                SendKeys.of(email).into(CandidateData.EMAIL),
                Click.on(CandidateData.SAVEBUTTON)
        );

    }

    public static CreateCandidate makeinformation(){
        return instrumented (CreateCandidate.class);
    }
}

