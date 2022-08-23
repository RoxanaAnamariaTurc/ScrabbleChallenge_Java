import java.util.HashMap;
import java.lang.String;

public class Scrabble {

    int score = 0;
    private String str;
    HashMap<Character, Integer> letters = new HashMap<>();


    public Scrabble(String str){
        this.str = str;
        letters.put('A', 1);
        letters.put('E', 1);
        letters.put('I', 1);
        letters.put('O', 1);
        letters.put('U', 1);
        letters.put('L', 1);
        letters.put('N', 1);
        letters.put('R', 1);
        letters.put('S', 1);
        letters.put('T', 1);
        letters.put('D', 2);
        letters.put('G', 2);
        letters.put('B', 3);
        letters.put('C', 3);
        letters.put('M', 3);
        letters.put('P', 3);
        letters.put('F', 4);
        letters.put('H', 4);
        letters.put('V', 4);
        letters.put('W', 4);
        letters.put('Y', 4);
        letters.put('K', 5);
        letters.put('J', 8);
        letters.put('X', 8);
        letters.put('Q', 10);
        letters.put('Z', 10);
    }

    int score(){
        if(this.str == null || this.str == " " ){
            return score += 0;
        }

        this.str = this.str.toUpperCase();
        for(int i = 0; i < str.length();i++) {
            score+=letters.get(str.charAt(i));
            }
        return score;
        }


    }



