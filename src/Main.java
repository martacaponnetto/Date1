import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

/*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta la data ottenuta in FULL, MEDIUM e SHORT
Stampa le varie versioni*/
public class Main {
    public static void main(String[] args) {
        // creo ogg OffsetDateTime
        OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        //formatto la data nei vari fomrati Full,Medium,Short:
        DateTimeFormatter formatterFull = DateTimeFormatter.ofPattern("EEEE-dd-MM-yyyy HH:mm:ss");
        String formattedFull = dateTime.format(formatterFull);
        DateTimeFormatter formatterMedium = DateTimeFormatter.ofPattern("dd - MM - yyyy HH:mm:ss");
        String formattedMedium = dateTime.format(formatterMedium);
        DateTimeFormatter formatterShort = DateTimeFormatter.ofPattern("d/M/yy H:mm");
        String formattedShort = dateTime.format(formatterShort);
        //stampo
        System.out.println("formato full : " + formattedFull);
        System.out.println("formato medium : " + formattedMedium);
        System.out.println("formato short : " + formattedShort);





    }
}