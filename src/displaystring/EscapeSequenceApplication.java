package displaystring;

public class EscapeSequenceApplication {

    public static  void main(String[] args){

        /*
         \n - newline
         \t - tab
         \" - double quote
         \\ - backlash

         */

        // The backslash allows you to “escape” the string’s literal interpretation. Notice there is no space between \n and How.
        System.out.println("Hello!\nHow are youdoing?");

        //Newline will create a space between two lines
        System.out.println("\n");

        //Quotation marks "" inside a string
        System.out.println("She said \"Hello!\" to me.");

        System.out.println("\n");
        System.out.println("\\Example of backlash");


    }
}
