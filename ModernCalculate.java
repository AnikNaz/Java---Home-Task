public class ModernCalculate {

    public static void main (String arg []) {
     
      System.out.println ("Calculate..");

      int first = Integer.valueOf (arg [0]);
      int second = Integer.valueOf (arg [1]);

      int sum = first + second;
      int subtraction = first - second;
      int div = first / second;
      int multiplication = first * second;

      System.out.println ("sum " + sum);
      System.out.println ("subtraction " + subtraction);
      System.out.println ("division " + div);
      System.out.println ("multiplication " + multiplication);

  }

}