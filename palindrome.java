import java.util.Scanner;
class palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp,n;    
  Scanner in = new Scanner(System.in); 
  System.out.println("Enter number "); 
  n = in.nextInt();
  temp=n;    
  while(n>0){    
   r=n%10;   
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}