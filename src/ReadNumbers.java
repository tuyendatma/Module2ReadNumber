import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = scanner.nextInt();
        String name ="";
        int numUnder100=0;

        int hundred=0;
        if(number>=0 && number<1000){
            if(number<100){
                name = readNumUnder100(number);
            }else {
                hundred =number/100;
                numUnder100= number - hundred*100;
                name = showOnes(hundred)+" hundred and "+ readNumUnder100(numUnder100);
            }
        }else {
            name = "out of ability";
        }
        System.out.println(name);
    }
    public static String showOnes(int number){
        String ones ="";
        switch (number){
            case 1:
                ones ="one";
                break;
            case 2:
                ones ="two";
                break;
            case 3:
                ones="three";
                break;
            case 0:
                ones ="zero";
                break;
            case 4:
                ones= "four";
                break;
            case 5:
                ones= "five";
                break;
            case 6:
                ones= "six";
                break;
            case 7:
                ones="seven";
                break;
            case 8:
                ones="eight";
                break;
            case 9:
                ones="nine";
                break;
        }
        return ones;
    }
    public static String showTeen(int number){
        String teen = "";
        switch (number){
            case 10:
                teen ="ten";
                break;
            case 11:
                teen ="eleven";
                break;
            case 12:
                teen ="twelve";
                break;
            case 13:
                teen ="thirteen";
                break;
            case 14:
                teen ="fourteen";
                break;
            case 15:
                teen ="fifteen";
                break;
            case 16:
                teen ="sixteen";
                break;
            case 17:
                teen ="seventeen";
                break;
            case 18:
                teen ="eighteen";
                break;
            case 19:
                teen ="nineteen";
                break;
        }
        return teen;
    }
    public static String showTenOf(int number){
        String tenOf="";
        switch (number){
            case 20:
                tenOf="twenty";
                break;
            case 30:
                tenOf="thirty";
                break;
            case 40:
                tenOf="forty";
                break;
            case 50:
                tenOf="fifty";
                break;
            case 60:
                tenOf="sixty";
                break;
            case 70:
                tenOf="seventy";
                break;
            case 80:
                tenOf="eighty";
                break;
            case 90:
                tenOf="ninety";
                break;
        }
        return tenOf;
    }
    public static String readNumUnder100(int number) {
        String name = "";
        int ones = 0;
        int tenOf = 0;
        if (number > 0 && number < 10) {
            name = showOnes(number);
        } else if (number < 20) {
            name = showTeen(number);
        } else if (number <= 99) {
            if (number % 10 == 0) {
                name = showTenOf(number);
            } else {
                ones = number % 10;
                tenOf = number - ones;
                name = showTenOf(tenOf) + " " + showOnes(ones);
            }

        }
        return name;
    }

}
