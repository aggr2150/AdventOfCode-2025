import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputUtils {
    static String[] getInput(String day) throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("resources/" + day + ".txt");
        Scanner sc = new Scanner(inputStream).useDelimiter("\n");
        List<String> list = new ArrayList<>();
        while(sc.hasNext()){
            list.add(sc.next());
        }
        return list.toArray(new String[0]);
    }
}
