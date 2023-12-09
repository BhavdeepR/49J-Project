import java.util.HashSet;
import java.util.TreeSet;
public class Pokemon {

    public static HashSet<Characters> getHitPointList(int maxHP, HashSet<Characters> baseSet){
        HashSet<Characters> hpFiltered = new HashSet<>();
        for(Characters ch : baseSet){
            if(ch.getHp() <= maxHP){
                hpFiltered.add(ch);
            }
        }
        return hpFiltered;
    }

    public static int getIsLengendaryCount(HashSet<Characters> baseSet){
        int count = 0;
        for(Characters ch : baseSet){
            if(ch.getIs_legendary() == 1){
                count++;
            }
        }
        return count;
    }

    public static TreeSet<Characters> getCharactersByFirstLetter(char firstLetter,
                                                                 HashSet<Characters> baseSet){
        String chName;
        char first;
        TreeSet<Characters> ts = new TreeSet<>();
        for(Characters ch : baseSet){
            chName = ch.getName();
            first = chName.charAt(0);
            if(Character.toLowerCase(first) == Character.toLowerCase(firstLetter)) {
                ts.add(ch);
            }

        }
        return ts;
    }




    public static void main(String[] args) {
        CsvReader cr = new CsvReader();
        HashSet<Characters> baseSet;
        TreeSet<Characters> baseTreeSet;
        HashSet<Characters> hitPoints;
        if(cr.readFile("/Users/bhavdeeprandhawa/Desktop/cs/java/Pokemon Project/pokemon.csv")){
           baseSet = cr.getCharactersSet();
           //for (Characters ch : baseSet){
               //System.out.println(ch.getName() + " " + ch.getHp() + " " + ch.getIs_legendary());
           //}
            /*
            baseTreeSet = getCharactersByFirstLetter('c', baseSet);
            for(Characters ch : baseTreeSet){
                System.out.println(ch.getName());
            }
             */
            /*
            hitPoints = getHitPointList(50, baseSet);
            for(Characters ch : hitPoints){
                System.out.println(ch.getName() + " " + ch.getHp());
            }

             */

            int isLegendaryCount = getIsLengendaryCount(baseSet);
            System.out.println(isLegendaryCount);
        }



    }
}