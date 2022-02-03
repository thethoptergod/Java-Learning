public class Classwork2322{
    public static void main(String args[]){
        String stack = "";
        int i = 1;
        String hold = "";
        while (stack.length() < 5){
            hold = Integer.toString(i);
            i++;
            stack = stack + hold;
            System.out.println(stack);
        }
    }
}