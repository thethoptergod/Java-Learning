import java.util.Scanner;
public class HW2622{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        int i = 1;
        long prev = 0;
        long curr = 1;
        long ansr = 1;
        int c;
        int v;
        String entry;
        String reverse = "";
        System.out.println("Enter Iterator Number");
        n = scan.nextInt();
        while(i < n){
            ansr = prev + curr;
            prev = curr;
            curr = ansr;
            i++;
        }
        System.out.println(ansr);
        System.out.println("Enter A String");
        entry = scan.nextLine();
        c = entry.length();
        v = c - 1;
        while(v >= 0){
            reverse = reverse + entry.charAt(v);
            v--;
        }
        if (reverse == entry){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
    }
}