import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class newproject {
    @Test

    public void newadjara (){
        Configuration.browserSize="1980x1020";
        open("https://www.adjarabet.com/ka");
        $(byAttribute("data-id","register-btn")).click();
        $(byText("შექმენი ახალი ანგარიში")).shouldBe(Condition.visible, Duration.ofMillis(2000));
        $(byAttribute("data-id","signUpFormFirstOfThree_firstname")).setValue("Teona");
        $(byAttribute("data-id","signUpFormFirstOfThree_lastname")).setValue("Kevlishvili");
        $(byText("მდედრობითი")).click();
        $(byAttribute("data-id","signUpFormFirstOfThree_country")).pressEnter();
        $(byAttribute("data-id","signUpFormFirstOfThree_personalId")).setValue("01011086991");
        $(byAttribute("data-id","signUpFormFirstOfThree_phoneNumber")).setValue("598180289");
        $(byAttribute("data-id","signUpFormFirstOfThree_username")).setValue("tete1");
        $(byAttribute("data-id","signUpFormFirstOfThree_password")).setValue("password123");

        sleep(4000);




    }

    }

