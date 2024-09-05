package co.com.test.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccessPlattformRecruitment {
    public static final Target RECRUITMENTBUTTON = Target.the("Boton reclutar").located(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));
    public static final Target ADDBUTTON = Target.the("Boton Añadir").located(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
}
