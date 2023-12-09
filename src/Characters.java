import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Characters implements Comparable<Characters> {
    // need to retrieve name, hp, and is_legendary from each line
    // name is column 31
    // hp is column 29
    // is_legendary is column 41
    private String name;
    private int hp;
    private int is_legendary;
    public Characters(String line){

        String[] line_array = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
        int length = line_array.length;

        name = line_array[30];
        if (line_array[28].isEmpty() || !line_array[28].matches("\\d+")) {
            // Handle the case when the value is empty or not a valid integer
            hp = 0; // Set a default value or handle it accordingly
        } else {
            hp = Integer.parseInt(line_array[28]);
        }


        is_legendary = Integer.parseInt(line_array[length - 1]);

    }

    public String getName(){
        return name;
    }
    public int getHp(){
        return hp;
    }
    public int getIs_legendary(){
        return is_legendary;
    }

    public int compareTo(Characters that){
        return this.getName().compareTo(that.getName());
    }


}
