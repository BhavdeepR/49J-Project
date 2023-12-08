public class Character {
    // need to retrieve name, hp, and is_legendary from each line
    // name is column 31
    // hp is column 29
    // is_legendary is column 41
    private String name;
    private int hp;
    private int is_legendary;
    public Character(String line){

        String[] line_array = line.split(",");
        int length = line_array.length;
        int index = 29;
        for(int i = 0; i <= length; i++){
            if(line_array[i].isEmpty()){
                index
            }
        }
        name = line_array[31];
        if (line_array[29].isEmpty() || !line_array[29].matches("\\d+")) {
            // Handle the case when the value is empty or not a valid integer
            hp = 0; // Set a default value or handle it accordingly
        } else {
            hp = Integer.parseInt(line_array[29]);
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


}
