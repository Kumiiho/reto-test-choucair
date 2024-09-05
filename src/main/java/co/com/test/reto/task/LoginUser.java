package co.com.test.reto.task;

import co.com.test.reto.userinterfaces.Login;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginUser implements Task {
    String user="Admin";
    String pass="admin123";

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(Login.USERNAME),
                SendKeys.of(user).into(Login.USERNAME),
                SendKeys.of(pass).into(Login.PASSWORD),
                Click.on(Login.LOGINBUTTON)
        );

    }

public static LoginUser makeinformation(){

        return instrumented (LoginUser.class);
}
}
