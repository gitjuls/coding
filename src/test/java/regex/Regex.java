package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {

   /* public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }*/

        public static void main(String args[]) {
            String input = "cathcatctaCat";
            //Regular expression to match the characters t or, m or, p
            String regex = "cat+";
            //Compiling the regular expression
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            //Retrieving the matcher object
            Matcher matcher = pattern.matcher(input);
            boolean result = matcher.matches();
            System.out.println("result " + result);
            int count = 0;
            while(matcher.find()) {
                count++;
            }
            System.out.println("Occurrences: "+count);
        }

    /*public static void main(String[] args) {
            //Reading String from user
            System.out.println("Enter a String");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String regex = "[^abcdef]";
            //Compiling the regular expression
            Pattern pattern = Pattern.compile(regex);
            //Retrieving the matcher object
            Matcher matcher = pattern.matcher(input);
            int count = 0;
            while(matcher.find()) {
                count++;
            }
            System.out.println("Occurrences :"+count);
    }*/
}
