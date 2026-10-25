import java.util.Arrays;
 // im so tired i wanna sleep but i have to finish this activity
public class Investigator {
    public static void main(String[] args) {
        byte maxByte = 127;
        maxByte++;
        System.out.println("Overflowed byte: " + maxByte);

        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = "Java";

        // s1 and s2 are false because 'new' forces them into separate memory locations in the heap
        System.out.println("s1 == s2: " + (s1 == s2)); 
        // false because s3 is in the string pool, but s1 is a separate object in the heap
        System.out.println("s1 == s3: " + (s1 == s3)); 
        
        System.out.println("s1.equals(s2): " + s1.equals(s2)); 
        System.out.println("s1.equals(s3): " + s1.equals(s3));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;

        arr2[0] = 99;

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}