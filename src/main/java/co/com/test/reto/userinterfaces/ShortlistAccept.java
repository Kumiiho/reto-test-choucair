package co.com.test.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShortlistAccept {
    public static final Target SHORTLISTBUTTON = Target.the("Boton Finalistas").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form/div[2]/div[2]/button[2]"));
    public static final Target SAVEBUTTON = Target.the("Boton Guardar").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
}