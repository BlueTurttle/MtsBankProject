import Pages.MainPage;
import Pages.MtsDengiPage;
import io.qameta.allure.Step;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MtsBankTests extends BaseTest {

    private final static String url = "https://www.mtsbank.ru/";
    MainPage mainPage = new MainPage();

    @Test
    @Description("Первый тест")
    public void test1() {

        mainPage.openPage(url);
        mainPage.hoverOnKarti();
        String a = mainPage.getProcent();
        String b = mainPage.getKashback();
        mainPage.clickOnKarta();

        MtsDengiPage mtsDengiPage = new MtsDengiPage();
        String a1 = mtsDengiPage.getProcent();
        String b1 = mtsDengiPage.getKashback();

        Assertions.assertEquals(b, b1);

    }
}