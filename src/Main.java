import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        addPeriodicTableSymbolsToArrayList();

    }
    private static void addPeriodicTableSymbolsToArrayList() {
        ArrayList<String> periodicSymbols = new ArrayList<String>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/davidshinabarger/Desktop/White-Label-FizzBuzz-1/src/Symbols.txt"))) {
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                periodicSymbols.add(currentLine);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(periodicSymbols.toArray()));
    }

    public static String main(String buzz) {
        return "buzz";
    }
}

