package codingBat;

public class StringOne {
    public static void main(String args[]) {
        StringOne str = new StringOne();
        System.out.println("*******************" + " Problem 1 " + "*******************");
        String input = "oddly";
        boolean result1 = str.endsLy(input);
        System.out.println("'" + input + "'" + " ends with ly: " + result1);
        input = "y";
        result1 = str.endsLy(input);
        System.out.println("'" + input + "'" + " ends with ly: " + result1);
        input = "oddy";
        result1 = str.endsLy(input);
        System.out.println("'" + input + "'" + " ends with ly: " + result1);

        System.out.println();
        System.out.println();
        System.out.println("*******************" + " Problem 2 " + "*******************");

    }


//    Given a string, return true if it ends in "ly".
//    endsLy("oddly") → true
//    endsLy("y") → false
//    endsLy("oddy") → false
    public boolean endsLy(String str) {

        if (str.length() >= 2 && str.substring(str.length() - 2, str.length()).equals("ly")) {
            return true;
        }
        return false;
    }


//    Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
//    nTwice("Hello", 2) → "Helo"
//    nTwice("Chocolate", 3) → "Choate"
//    nTwice("Chocolate", 1) → "Ce"
    public String nTwice(String str, int n) {



        return null;
    }


}
