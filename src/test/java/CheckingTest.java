import org.junit.jupiter.api.Test;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class CheckingTest {
    @Test
    void Test() {
        open("http://localhost:9999");
        $("[data-test-id=\"city\"].input__control").setValue("Ставрополь");
        $("[data-test-id=\"date\"].input__control").setValue("13.11.2022");
        $("[data-test-id=\"name\"].input__control").setValue("Иванов Иван");
        $("[data-test-id=\"phone\"].input__control").setValue("+79286380900");
        $("[data-test-id=\"agreement\"].checkbox__box").click();
        $(byText("Забронировать")).click();
        $(byText("Успешно")).should(visible, Duration.ofSeconds(15));
    }
}

