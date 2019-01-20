import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FileNotFound {
    public static void main(String[] args) {
        File file = new File("E:\file.txt");
        File file1;
        try {
            new SimpleDateFormat("MM,dd,yyy").parse("invalid-date");
            Thread.sleep(1000);
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        } catch (InterruptedException e) {
            System.out.println("Interupted");
        } catch (ParseException e) {
            System.out.println("Parse");
        } finally {
            System.out.println("Finaly");
        }
        System.out.println("1213");
    }
}
