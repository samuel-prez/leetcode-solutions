import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length()) {
            return false;
        }
            int[] letrasA = new int[26];
            int[] letrasB = new int[26];
            for(int i=0;i<a.length();i++) {
                char letra = a.charAt(i);
                int index = letra - 'a';
                letrasA[index]++;
            }
            for(int i=0;i<b.length();i++) {
                char letra = b.charAt(i);
                int index = letra - 'a';
                letrasB[index]++;
            }
            
            for(int i=0;i<26;i++) {
                if(letrasA[i] != letrasB[i]){
                    return false;
                } 
            }
            return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}