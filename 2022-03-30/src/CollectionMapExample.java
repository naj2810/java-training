import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CollectionMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter String of words:");
        String str = scanner.nextLine();

        Map<Character, Integer> character_Occurance = new HashMap<>();

        Map<String, Integer> character_S_Occurance = new HashMap<>();
        char[] chars = str.toCharArray();



            for (char occur_Ch : chars) {
                Integer integer = character_Occurance.get(occur_Ch);
                if (integer == null) {
                    character_Occurance.put(occur_Ch, 1);
                } else {
                    character_Occurance.put(occur_Ch, integer + 1);
                }
            }


            System.out.println("\n Occurances of each character in a string" + character_Occurance);





            for (String occur1 : word) {
                Integer integer = character_S_Occurance.get(occur1);
                if (integer == null) {
                    character_S_Occurance.put(occur1, 1);
                } else {

                    character_S_Occurance.put(occur1, integer + 1);
                }
            }
            System.out.println("String Occurance :\n " + character_S_Occurance);


        }
    }



