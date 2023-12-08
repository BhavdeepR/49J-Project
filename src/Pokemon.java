import java.util.HashSet;
public class Pokemon {
    public static void main(String[] args) {
        CsvReader cr = new CsvReader();
        HashSet<Character> baseSet;
        if(cr.readFile("/Users/bhavdeeprandhawa/Desktop/cs/java/Pokemon Project/pokemon.csv")){
           baseSet = cr.getCharacterSet();
           for (Character ch : baseSet){
               System.out.println(ch.getName() + " " + ch.getHp() + " " + ch.getIs_legendary());
           }
        }
    }
}