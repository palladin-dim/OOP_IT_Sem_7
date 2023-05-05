import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;


public class Logger {

    Date date = new Date();
    private String text;

    public void log(String message) {
        text = String.format("%s \n %s", date.toString(), message);
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("log.txt", true), "UTF-8")) {
            writer.write(text + " ");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void log(double arg1, double arg2) {
        text = String.format("%s \n Итог: %.2f+%.2fi", date.toString(), arg1, arg2);
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("log.txt", true), "UTF-8")) {
            writer.write(text+ " ");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
