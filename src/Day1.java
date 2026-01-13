import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] list = InputUtils.getInput("Day1");
        int key = 50;
        int ans = 0;
        for (String val : list) {
            if(val.startsWith("L")){
                key -= Integer.parseInt(val.substring(1));
            } else {
                key += Integer.parseInt(val.substring(1));
            }
            if(key % 100 == 0){
                ans++;
            }
            key %= 100;
        }
        System.out.println(ans);
        return;
    }
}
