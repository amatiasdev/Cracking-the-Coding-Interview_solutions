// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.HashSet;
class IsUnique_Aldo {
    public static void main(String[] args) {
        System.out.println("*** Test 1.1: Unique characters?\n");
        test("Benny");
        test("Ben");
        test("Alex");
    }

    private static void test(String str) {
        System.out.format("%8s: %s%n", str, isUnique(str));
    }
    
    public static boolean isUnique(String text){
        
        HashSet <Character> hash = new HashSet<Character>(); 
        
        for(int i =0; i< text.length(); i++){
            char value =text.charAt(i);
            if(hash.contains(value)){
                return false;
            }
            hash.add(value);
        }
        
        return true;
    }
}