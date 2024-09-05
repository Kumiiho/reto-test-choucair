package co.com.test.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PassedInterview {
    public static final Target PASSEDBUTTON = Target.the("Boton Pasa").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[3]"));
    public static final Target SAVEBUTTON = Target.the("Boton Guardar").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));

}
