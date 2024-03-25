import java.util.*;
public class RemoveBackspaceQuestion844 {
        public static void main(String[] args) {

            String str1 = "ab##";
            String str2 = "c#d#";
            String aux1 = "", aux2="";


            for(int i=0; i<str1.length(); i++){
                if(str1.charAt(i) == '#'){
                    String s=String.valueOf(str1.charAt(i-1));
                    s=s+"#";
                    aux1 = str1.replace(s, "");
                }
            }
            for(int i=0; i<str2.length(); i++){
                if(str2.charAt(i) == '#'){
                    String s=String.valueOf(str2.charAt(i-1));
                    s=s+"#";
                    aux2 = str2.replace(s, "");
                }
            }

            System.out.println("aux1 = "+aux1 +" aux2 = "+aux2);


            System.out.println(aux1.equals(aux2));



        }
    }
