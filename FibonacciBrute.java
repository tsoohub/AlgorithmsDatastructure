public class FibonacciBrute {

    int counter=0;

    int fibonacci(int n) {
        if(n <= 0)  return 0;
        if(n == 1)  return 1;

        counter++;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FibonacciBrute f = new FibonacciBrute();
        System.out.println(f.fibonacci(30));        // 832040
        System.out.println("counter: "+f.counter);  // 1346268
    }
}
