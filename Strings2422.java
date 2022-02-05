import java.util.Scanner;
public class Strings2422{
    public static void main(String args[]){
        String fname;
        String lname;
        String name;
        String str1 = "suck";
        String str2 = "SuCK";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        fname = scan.nextLine();
        System.out.println("Enter your Last Name: ");
        lname = scan.nextLine();
        System.out.println(fname.length());
        name = fname.concat(lname);
        System.out.println(name);
        System.out.println(fname.indexOf("o"));
        System.out.println(lname.lastIndexOf("d"));
        System.out.println(fname.charAt(3));
        System.out.println(lname.isEmpty());
        System.out.println(fname.contains("o"));
        System.out.println(fname.substring(2));
        System.out.println(fname.substring(0,2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("c"));
        System.out.print(name.endsWith("g"));
    }
}