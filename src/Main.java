
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        InputReader inputReader = new InputReader(System.in);

        int n = inputReader.nextInt();

        SequenceWithoutDuplicatesNumeral sequenceWithoutDuplicatesNumeral =
                new SequenceWithoutDuplicatesNumeral();
        System.out.println(sequenceWithoutDuplicatesNumeral.getElement(n));

    }
}


class SequenceWithoutDuplicatesNumeral {
    private int iterator;
    private Integer tempElement;
    private ArrayList<Integer> sequenceElements;


    public SequenceWithoutDuplicatesNumeral() {
        sequenceElements = new ArrayList<>();
        iterator = 0;
        tempElement = new Integer(0);
    }


    Integer getElement(Integer index) {
        while (iterator < index) {
            tempElement++;
            Set<Character> characterSet = new HashSet<>();
            String tempChisloToString = tempElement.toString();

            for (char tempSumbol : tempElement.toString().toCharArray()) {
                characterSet.add(tempSumbol);
            }

            if (tempChisloToString.length() == characterSet.size())
                iterator++;


        }
        return tempElement;
    }
}

class InputReader {

    private BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }
}