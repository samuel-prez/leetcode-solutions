import java.io.*;
import java.util.*;

public class First_Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] tokens = s.split("[ !,?._'@]+");
        String resultado = "";
        int contTokens = 0;
        for(int i=0;i<tokens.length;i++){
            contTokens++;
            resultado += tokens[i];
            if(i<tokens.length-1){
                resultado += "\n";
            }
        }
        System.out.println(contTokens);
        System.out.println(resultado);
        scan.close();
    }
}



public class Solution_opti {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for(String tok : tokens){
           System.out.println(tok); 
        }
        scan.close();
    }
}

