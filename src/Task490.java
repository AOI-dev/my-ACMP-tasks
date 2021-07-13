import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.time.*;
import java.time.format.DateTimeFormatter;


class Task490 {
    public static void main(String[] args) throws IOException, ParseException {
        var br = new BufferedReader(new InputStreamReader(System.in));

        var d = DateTimeFormatter.ofPattern("dd.MM.yy");

        LocalDateTime ldt1 = LocalDateTime.parse(br.readLine(), d);
        LocalDateTime ldt2 = LocalDateTime.parse(br.readLine(), d);

        ZoneId zoneId_mowcow = ZoneId.of("Europe/Moscow");
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, zoneId_mowcow);
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt2, zoneId_mowcow);

//        System.out.println(zdt1 - zdt1.getNano());

    }
}