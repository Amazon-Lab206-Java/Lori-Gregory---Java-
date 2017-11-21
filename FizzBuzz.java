public class FizzBuzz {
        public String fizzBuzz(String number) {
if(number % 15 == 0)   {
    System.out.println("FizzBuzz");
    }
    else if(number % 5 == 0) {
        System.out.println("Buzz");
    }
    else if(number % 3 == 0) {
        System.out.println("Fizz");
    }
    else {
        System.out.println(number);
        }
    // return String.valueOf(number);
    }
}
