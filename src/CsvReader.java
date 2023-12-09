import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
public class CsvReader {

    HashSet<Characters> hs = new HashSet<>();
    String line = "";
    public boolean readFile(String fileName){
        //read each line from input and pass as the String as a parameter for Characters constructor
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            br.readLine();
            while ((line = br.readLine()) != null) {
                Characters ch = new Characters(line);
                hs.add(ch);
            }
        }

        catch (IOException e){
            e.printStackTrace();
            return false;

        }

        return true;
    }


    public HashSet<Characters> getCharactersSet(){
        return hs;
    }
}
