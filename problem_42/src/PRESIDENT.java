import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by president on 3/27/14.
 */
public class PRESIDENT {
    public static void main(String args[]) {
        // Получене времени начала запуска приложения
        Date start = new Date();

        String pathFile = "words.txt";
        String words = "";
        int result = 0;
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(pathFile));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine())!=null) { words = sCurrentLine.toString(); }}
        catch (FileNotFoundException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace();}

        words = words.replace("\"", "");
        words = words.toLowerCase();
        String[] arrWords = words.split(",");

        for (int i = 0; i < arrWords.length; i++) {
            if (isTriangleWord(arrWords[i])) { result++; } }

        System.out.println("Найдено " + result + " треугольных слова;");

        // Получение времени завершения приложения
        Date stop = new Date();
        // Передаём время начала/конца на обработку и вывод
        runTime.calculateTime(start, stop);
    }

    // Английский алфавит
    public static Map<String, Integer> alphabet = new HashMap<String, Integer>(){{
        put("a", 1);  put("b", 2);  put("c", 3);  put("d", 4);  put("e", 5);
        put("f", 6);  put("g", 7);  put("h", 8);  put("i", 9);  put("j", 10);
        put("k", 11); put("l", 12); put("m", 13); put("n", 14); put("o", 15);
        put("p", 16); put("q", 17); put("r", 18); put("s", 19); put("t", 20);
        put("u", 21); put("v", 22); put("w", 23); put("x", 24); put("y", 25);
        put("z", 26);
    }};

    // Проверка слова на треугольность
    private static boolean isTriangleWord(String arrWord){
        String[] word = arrWord.split("");
        int wordNumber = 0;
        for (int i = 1; i < word.length; i++) { wordNumber += alphabet.get(word[i]); }
        if (isTriangleNumber(wordNumber)) { return true; }
        else return false;
    }

    // Проверка числоваго значения слова на треугольность
    private static boolean isTriangleNumber(int number) {
        for (int i = 1; i <= number; i++) {
            float Tn = 0.5f*i*(i+1);
            if ((int)Tn == number) return true;
            else if (Tn > number)  return false; }
        return true;
    }


}
