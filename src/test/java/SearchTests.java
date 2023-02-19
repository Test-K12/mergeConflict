import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchYandexTest() {
        open("https://ya.ru/");
        $(".search3__input").setValue("Привет Алиса").pressEnter();
        $("input").shouldHave(value("Привет Алиса"));
    }
    @Test
    void succesfulSearchGoogleTest() {
        open("https://google.com");
        $("[name=q]").setValue("selenide").pressEnter();
        $("[id=search").shouldHave(text("https://ru.selenide.org"));
    }
}
