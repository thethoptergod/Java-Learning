import java.util.Scanner;
class UserInput2322{
    public static void main(String args[]){
        int inum;
        long lnum;
        float fnum;
        double dnum;
        char onechar;
        String str;
        String name ="";
        String address = "";
        boolean choice;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any integer");
        inum = scan.nextInt();
        System.out.println("enter any long");
        lnum = scan.nextLong();
        System.out.println("enter any decimal");
        fnum = scan.nextFloat();
        System.out.println("enter any big decimal");
        dnum = scan.nextDouble();
        System.out.println("enter true or false");
        choice = scan.nextBoolean();
        System.out.println("enter your name");
        name = scan.next();
        scan.nextLine();
        System.out.println("enter your home address");
        address = scan.nextLine();
        System.out.println("enter one character");
        str = scan.nextLine();
        onechar = str.charAt(0);
        System.out.println(inum);
        System.out.println(lnum);
        System.out.println(fnum);
        System.out.println(dnum);
        System.out.println(choice);
        System.out.println(name);
        System.out.println(address);
        System.out.print(onechar);
    }
}