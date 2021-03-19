public class ReverseOrder 
{
   public static void main(String[] args)
   {
    String str = "ABCDEFG";
    String str2 = "how";
    String reverse = new StringBuffer(str).reverse().toString(); //method to reverse the string
    String reverse2 = new StringBuffer(str2).reverse().toString();
    System.out.println(reverse);
    System.out.println(reverse2);
   }
}