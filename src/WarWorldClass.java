import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarWorldClass implements TextFinder{

    StringBuilder stringBuilder = new StringBuilder();



    public WarWorldClass() {

    }

    public StringBuilder readFile (){
       try(
               BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Documents\\Java\\Война и мир.txt"))
       )
       {
           //чтение построчно
           String text;
           while((text=br.readLine())!=null){
               stringBuilder.append(text);
           }
       }
       catch(IOException ex){

           System.out.println(ex.getMessage());
       }
       return stringBuilder;
   }


    @Override
    public int countWord(StringBuilder text, String findWord) {

        final Pattern pattern = Pattern.compile(findWord, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(text);
        int count =0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
    public int countWordMethodSecond(StringBuilder text, String findWord) {
        int counter =0;
        int lastPosition =0;
        String lowerCase = text.toString().toLowerCase();
        while (lowerCase.indexOf(findWord,lastPosition)>=0) {
            counter++;
            lastPosition = lowerCase.indexOf(findWord,lastPosition)+findWord.length();
        }
        return counter;
    }

}
