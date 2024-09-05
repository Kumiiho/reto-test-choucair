package co.com.test.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CandidateData {

    public static final Target FIRSTNAME = Target.the("Primer nombre").located(By.name("firstName"));
    public static final Target MIDDLENAME = Target.the("Segundo nombre").located(By.name("middleName"));
    public static final Target LASTNAME = Target.the("Apellido").located(By.name("lastName"));
    public static final Target VACANCYSELECT = Target.the("Seleccion Vacante").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div"));
    public static final Target VACANCYCORRECT = Target.the("Vacante correcta").located(By.xpath("    //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[1]"));
    public static final Target EMAIL = Target.the("Email").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));
    public static final Target SAVEBUTTON = Target.the("Boton guardar").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[8]/button[2]"));
}
