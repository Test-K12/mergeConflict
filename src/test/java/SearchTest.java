import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selenide.*;

public class SearchTest {
    @Test
    void successfulSearchTest() {
        open("https://ya.ru/");
        $(".search3__input").setValue("Привет Алиса").pressEnter();
        $("input").shouldHave(value("Привет Алиса"));
    }
}
