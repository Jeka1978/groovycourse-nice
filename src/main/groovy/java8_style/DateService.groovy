package java8_style

import java.time.DayOfWeek
import java.time.LocalDate

import static java.time.DayOfWeek.FRIDAY

/**
 * @author Evgeny Borisov
 */
class DateService {
    void friday13(int startYear, int endYear) {
        LocalDate startDate = LocalDate.of(startYear, 1, 12)
        LocalDate endDate = LocalDate.of(endYear, 12, 14)
        (startDate..endDate)
                .findAll{it.dayOfWeek==FRIDAY}
                .findAll{it.dayOfMonth==13}
                .countBy {it.year}
                .sort{-it.value}
                .each {println(it)}
    }

    public static void main(String[] args) {
        new DateService().friday13(1900, 1999)
    }
}
