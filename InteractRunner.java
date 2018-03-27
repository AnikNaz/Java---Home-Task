
// All  numbers we must write with "."

import java.util.Scanner;
public class InteractRunner {
    public static void main (String [] arg) {

        Scanner reader = new Scanner (System.in);

        try {
            Calculator calc = new Calculator ();
            String exit = "no";
            String plus = "+";
            String min = "-";
            String mult = "*";
            String div = "/";
                while (!exit.equals("yes")) {
                System.out.print ("Enter first arg: ");
                String first = reader.next();
                System.out.print ("Enter second arg: ");
                String second = reader.next();
                System.out.print("Enter your operation ('+' '-' '*' '/'): ");
                String comp = reader.next();
                if (comp.equals(plus)) {calc.add(Float.valueOf(first), Float.valueOf(second));}
                if (comp.equals(min)) {calc.minus(Float.valueOf(first), Float.valueOf(second));}
                if (comp.equals(mult)) {calc.multiplication(Float.valueOf(first), Float.valueOf(second));}
                if (comp.equals(div)) {calc.division(Float.valueOf(first), Float.valueOf(second));}
                System.out.println ("Result: " + calc.getResult());
                calc.cleanResalt();
                System.out.print ("Exit yes/no:  ");
                exit = reader.next();
            }

        } finally {

            reader.close();

        }

    }
}
