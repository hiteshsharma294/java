import java.util.Scanner;
 class Prime {

    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter number : "); 
        n = in.nextInt();
        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}