public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Goodbye     ","     World    ");
        System.out.println(str);  
    
        char letter = 'i';
        Integer a = manipulator.getIndexOrNull("Greeting", letter);
        Integer b = manipulator.getIndexOrNull("Hi, my name is Lori", letter);
        Integer c = manipulator.getIndexOrNull("Goodbye", letter);
        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
    
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer s = manipulator.getIndexOrNull(word, subString);
        Integer w = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(s);
        System.out.println(w);
    
     } 
    }
    
