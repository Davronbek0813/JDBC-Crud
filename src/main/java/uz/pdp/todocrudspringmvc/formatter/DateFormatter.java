package uz.pdp.todocrudspringmvc.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatter implements Formatter<LocalDateTime> {
    @Override
    public String print(LocalDateTime date, Locale locale) {
        if (date == null) {
            return "";
        }
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd:HH:mm"));
    }

    @Override
    public LocalDateTime parse(String formatted, Locale locale) throws ParseException {
        if (formatted.length() == 0) {
            return null;
        }
        return LocalDateTime.parse(formatted);
    }

}
