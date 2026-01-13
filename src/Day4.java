import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Day4 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] list = InputUtils.getInputList("Day4", "\n");
        AtomicInteger ans = new AtomicInteger();
        int[][] sheet = new int[list.length][list[0].length()];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[0].length(); j++) {
                int c = list[i].charAt(j);
                if (c == '.'){
                    sheet[i][j] = 5;
                } else {
                    increaseRoll(sheet, i, j);
                }
            }
        }
        Arrays.stream(sheet).forEach(row -> {
            Arrays.stream(row).forEach(val -> {if(val < 4) {
                System.out.println(val);
                ans.getAndIncrement();
            }});
        });
        System.out.println(ans.get());
        return;
    }
    static void increaseRoll(int[][] sheet, int row, int col){
        increaseCell(sheet, row - 1, col - 1);
        increaseCell(sheet, row - 1, col);
        increaseCell(sheet, row - 1, col + 1);
        increaseCell(sheet, row, col - 1);
        increaseCell(sheet, row, col + 1);
        increaseCell(sheet, row + 1, col - 1);
        increaseCell(sheet, row + 1, col);
        increaseCell(sheet, row + 1, col + 1);
    }
    static void increaseCell(int[][] sheet, int row, int col){
        try {
            if(sheet[row][col] < 5){
                sheet[row][col]++;
            }
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }
}

