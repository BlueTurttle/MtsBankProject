package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import config.ProjectConfig;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement kartiButton = $x("//a[@href='/chastnim-licam/karti/']");
    private final SelenideElement procentText = $x("//*[@id=\"__next\"]/div[1]/nav/div[1]/div[1]/div[1]/div[1]/div[2]/div/div[1]");
    private final SelenideElement kashbackText = $x("//*[@id=\"__next\"]/div[1]/nav/div[1]/div[1]/div[1]/div[1]/div[2]/div/div[2]");
    private final SelenideElement goToNextPage = $x("//*[@id=\"__next\"]/div[1]/nav/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]/div");

    public static final ProjectConfig config = ConfigFactory.create(ProjectConfig.class);


    public MainPage openPage() {
        Selenide.open(config.baseUrl());
        return this;
    }

    public void hoverOnKarti() {
        kartiButton.hover();
    }

    public String getProcent() {
        return procentText.getText();
    }

    public String getKashback() {
        return kashbackText.getText();
    }

    public void clickOnKarta() {
        goToNextPage.click();
    }
}