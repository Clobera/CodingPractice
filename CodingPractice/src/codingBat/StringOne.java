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
        String result3 = str.nTwice("hellooooooImcarlos", 2);
        System.out.println(result3);

        System.out.println();
        System.out.println();
        System.out.println("*******************" + " Problem 3 " + "*******************");
        String random = "hello";
        System.out.println(random.substring(1,5));


        System.out.println();
        System.out.println();
        System.out.println("*******************" + " BIG O stuff " + "*******************");

        int[] arr = new int[]{0,1,2,3,4,5,6,7};


        str.printUnorderedPairs(arr);

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
        return str.substring(0,n) + str.substring(str.length() - n, str.length());

    }


//    Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
//    twoChar("java", 0) → "ja"
//    twoChar("java", 2) → "va"
//    twoChar("java", 3) → "ja"
    public String twoChar(String str, int index) {
        if(index >= str.length()-1 || index < 0){
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

//    Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.
//    hasBad("badxx") → true
//    hasBad("xbadxx") → true
//    hasBad("xxbadxx") → false


    public boolean hasBad(String str) {
        if(str.length() >= 3 && str.substring(0,3).equals("bad") || str.length() >= 4 && str.substring(1,4).equals("bad") ){
            return true;
        }
        return false;
    }



    public void printUnorderedPairs(int[] array){
        for (int i = 0; i < array.length; i++)
            for (int j = i + 1; j < array.length; j++){
                System.out.println(array[i] + " , " + array[j]);
            }
    }


}
