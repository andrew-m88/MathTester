public class MathTester {

    public static void main(String[] args){
        String firstword;
        String secondword;
        int firstNumber, secondNumber, total;

        firstword = "Dog";
        secondword = "House";
        firstNumber = 5;
        secondNumber = 10;
        total = firstNumber+secondNumber;

        System.out.println(total);
        System.out.println(firstword+secondword);
        System.out.println(firstword+(firstNumber+secondNumber));
        System.out.println("firstNumber + secondNumber is "+ (firstNumber+secondNumber));
        System.out.println("firstNumber - secondNumber is "+ (firstNumber-secondNumber));
        System.out.println("secondNumber / firstNumber is "+ (secondNumber/firstNumber));
        System.out.println("secondNumber * firstNumber is "+ (secondNumber* firstNumber));
        System.out.println("The modulus of the secondNumber by the firstNumber"+
                " is "+(secondNumber%firstNumber));









    }
}
