import java.io.FileNotFoundException;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] list = InputUtils.getInputList("Day2", ",");

        long ans = 0;
        for (String val : list) {
            String[] pair = val.split("-");
            for (long i = Long.parseLong(pair[0]); i <= Long.parseLong(pair[1]); i++) {
                String target = Long.valueOf(i).toString();
                if(target.length() % 2 == 0){
                    if(target.substring(target.length() / 2).equals(target.substring(0, target.length() / 2))){
                        ans += i;
                    }
                }
            }

        }
        System.out.println(list[0]);
        System.out.println(ans);
        return;
    }
}

