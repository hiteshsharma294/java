import java.util.Scanner;
 class ReverseNumber {
    public static void main(String[] args) {
        int num, reversed = 0;
        Scanner in = new Scanner(System.in); 
        System.out.println("Enter number "); 
        num = in.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}