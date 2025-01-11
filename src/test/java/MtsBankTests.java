import Pages.MainPage;
import Pages.MtsDengiPage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MtsBankTests extends BaseTest {

    private final static String url = "https://www.mtsbank.ru/";
    MainPage mainPage = new MainPage();

    @Test
    public void test1() {

        mainPage.openPage();
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