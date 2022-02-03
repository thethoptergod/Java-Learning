public class HW2322{
    public static void main(String args[]){
        int score = 85;
        int day = 4;
        int num = 64;
        String dayString = "Invalid";
        boolean odd = true;
        if ((num % 2) == 0){
            odd = false;
        }
        else {
            odd = true;
        };
        if (score > 89){
            System.out.println('A');
        }
        else if (score > 79){
            System.out.println('B');
        }
        else if (score > 69){
            System.out.println('C');
        }
        else if (score > 54){
            System.out.println('D');
        }
        else{
            System.out.println('F');
        };
        switch (day){
            case 1: dayString = "Monday";
            break;
            case 2: dayString = "Tuesday";
            break;
            case 3: dayString = "Wednesday";
            break;
            case 4: dayString = "Thursday";
            break;
            case 5: dayString = "Friday";
            break;
            case 6: dayString = "Saturday";
            break;
            case 7: dayString = "Sunday";
            break;
        };
        System.out.println(dayString);
        if (odd == true){
            System.out.print("Cool");
        }
        else if ((odd == false) & (num < 6)){
            System.out.print("Not Cool");
        }
        else if ((odd == false) & (num < 21)){
            System.out.print("Cool");
        }
        else{
            System.out.print("Not Cool");
        };
        
    };
};