package codingBat;

public class ChatGptGuide {
    public static void main(String args[]){
        ChatGptGuide gpt = new ChatGptGuide();
//      Write a Java program to print "Hello, World!" on the console.
        System.out.println("Hello World!");
//      Write a Java program that accepts an integer as input and checks whether the number is even or odd. If the number is even, print "Even number." If the number is odd, print "Odd number."
        System.out.println(gpt.oddOrEven(4));
//      Write a Java program that calculates and prints the sum of two integers.
        System.out.println(gpt.sum(4,4));
//      Write a Java program that accepts a string as input and prints its length.
        System.out.println(gpt.strLength("hello"));
//      Write a Java program that calculates and prints the area of a circle given its radius. Assume that the value of pi is 3.14.
        System.out.println(gpt.areaCirc(3));
//      Write a Java program that accepts two integers as input and calculates and prints their product.
        System.out.println(gpt.productInts(3,3));
//      Write a Java program that accepts a string as input and prints it in reverse order.
        System.out.println(gpt.reverseStr("Carlos"));
//      Write a Java program that accepts an integer as input and checks whether the number is a prime number or not. If the number is prime, print "Prime number." If the number is not prime, print "Not a prime number."
        System.out.println(gpt.isPrime(4));
//      Write a Java program that accepts two integers as input and calculates and prints their quotient and remainder.
//      Write a Java program that accepts a character as input and checks whether it is a vowel or not. If the character is a vowel, print "Vowel." If the character is not a vowel, print "Consonant."
    }
    public String oddOrEven(int num){
        String what = "odd";
        if (num % 2 == 0) {
            what = "even";
        }
        return what;
    }

    public int sum(int a, int b){
        return a + b;
    }

    public int strLength(String str){
        return str.length();
    }

    public double areaCirc(double radius){
        return 3.14 * (radius * radius);
    }

    public int productInts(int a, int b){
        return a * b;
    }

    public String reverseStr(String str){
        String newStr = "";
        for(int i= 0; i< str.length(); i ++){
            newStr = str.charAt(i) + newStr;
        }
        return newStr;
    }

    public String isPrime(int a) {
        if (a <= 1) {   // check if the number is less than or equal to 1
            return "Not a prime number.";
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {   // check if the number is divisible by any integer between 2 and sqrt(a)
            if (a % i == 0) {
                return "Not a prime number.";
            }
        }
        return "Prime number.";   // if the number is not divisible by any integer between 2 and sqrt(a), then it's a prime number
    }

}
