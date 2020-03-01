package datafactory;


import parameters.ContactUsRecord;
import com.github.javafaker.Faker;

import java.util.Locale;


public class TestData {

    Faker faker;
    Locale local;
    public TestData() {

        faker = new Faker(local= new Locale("en-AU"));
    }

 public ContactUsRecord generateContactUsRecord(String reasonForEnquiry, String message) {

        return new ContactUsRecord(
                faker.name().firstName(),
                faker.name().lastName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().cellPhone(),
                faker.company().url(),
                faker.company().name(),
                reasonForEnquiry,
                message
                );
    }
}


