import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {
    static String[] getInputLines(String day) throws FileNotFoundException {
        InputStream inputStream = getInputStream(day);
        Scanner sc = new Scanner(inputStream).useDelimiter("\n");
        List<String> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.next());
        }
        return list.toArray(new String[0]);
    }

    static String[] getInputList(String day, String delimiter) throws FileNotFoundException {
        InputStream inputStream = getInputStream(day);
        Scanner sc = new Scanner(inputStream).useDelimiter(delimiter);
        List<String> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.next());
        }
        return list.toArray(new String[0]);
    }

    private static InputStream getInputStream(String day) throws FileNotFoundException {
        return new FileInputStream("resources/" + day + ".txt");
    }
}
