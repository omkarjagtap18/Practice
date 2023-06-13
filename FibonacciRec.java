//Recursion
class FibonacciRec{
    static int a=0, b=1, c;  //  Why static keyword is used before main method in Java?
//  The term static is used in the main() method to make it a class-related method. The main() method is declared static so that JVM can call it without creating an instance of the class containing the main() method. We must declare the main() function static as no class object is present when the java runtime starts.
    public static void main(String[] args) {
      System.out.print(a+" "+b);
      FibonacciRec ob = new FibonacciRec();
      ob.printFib(10);  // calling method
    }
    void printFib(int i){
        if(i>=1){  // i is Greater than equal to 1
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
            printFib(i-1);   // recursively calling method

        }
    }
}