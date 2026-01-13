import java.io.FileNotFoundException;

public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] list = InputUtils.getInputList("Day3", "\n");
        int ans = 0;
        for (String val : list) {
            int first = 0, second = 0;
            for (int i = 0; i < val.length(); i++) {
                int c = val.charAt(i) - 48;
                if(first < second){
                    first = second;
                    second = c;
                } else if(c > second){
                    second = c;
                }
            }
            ans += first * 10 + second;
            System.out.println(first * 10 + second);
        }
        System.out.println('9' - 48);
        System.out.println(ans);
        return;
    }
}

