class StringFormatter {  
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  
} 

public class revstring {  
public static void main(String[] args) {  
    System.out.println(StringFormatter.reverseWord("India is my country"));  
    System.out.println(StringFormatter.reverseWord("I love my diversity"));    
    }  
} 