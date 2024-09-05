package co.com.test.reto.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target USERNAME = Target.the("Usuario").located(By.name("username"));
    public static final Target PASSWORD = Target.the("Password").located(By.name("password"));
    public static final Target LOGINBUTTON = Target.the("Login").located(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
}
