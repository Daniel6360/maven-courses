package ro.itschool.homework16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class BirthYearCalculator {
    public int calculateAge(int age) throws Exception {
        LocalDate localDate = LocalDate.now();
        int date = Integer.parseInt(DateTimeFormatter.ofPattern("yyyy").format(localDate));

        if (age < 1) {
            throw new LessThanOneException();
        }

        if (age > 130) {
            throw new AgeTooBigException();
        }

        return date - age;
    }
}
