import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static String main(String inputWord) {

        List<String> periodicSymbols = addTableOfElementsToList();

        String wordOutput = getOutputString(inputWord, periodicSymbols);

        return wordOutput;

    }

    private static List<String> addTableOfElementsToList() {
        List<String> periodicSymbols = new ArrayList<>();

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
        return periodicSymbols;
    }

    private static String getOutputString(String inputWord, List<String> periodicSymbols) {
        String wordOutput = null;
        for (int i = 0; i < 104; i++) {
            String capitalizedInputWord = inputWord.toUpperCase();
            String currentPeriodicElement = periodicSymbols.get(i);

            if(capitalizedInputWord.length() <=2) {

                if (periodicSymbols.contains(capitalizedInputWord)) {
                    wordOutput = capitalizedInputWord;
                } else if (currentPeriodicElement.equalsIgnoreCase(capitalizedInputWord)) {
                    wordOutput = currentPeriodicElement;
                }
            }
            //TODO add section if the word input from user is longer than two letters

        }
        return wordOutput;

    }
}

