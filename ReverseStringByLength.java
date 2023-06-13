public class ReverseStringByLength {
    public static void main(String[] args) {
        String input = "Hello, World!";

        String reversed = reverseStringByLength(input);

        System.out.println(reversed);
    }

    public static String reverseStringByLength(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));  //In the code snippet reversed.append(input.charAt(i));, reversed is an instance of the StringBuilder class. StringBuilder is a mutable sequence of characters in Java that allows efficient manipulation of strings.

//The append() method of the StringBuilder class is used to add characters or strings to the existing sequence. In this case, input.charAt(i) retrieves the character at the index i from the input string.

//Therefore, reversed.append(input.charAt(i)) appends the character at index i of the input string to the reversed StringBuilder object. It effectively builds the reversed string by adding each character from the original string in reverse order, one by one, to the reversed StringBuilder object.
        }

        return reversed.toString();
    }
}

//In the code above, we have a reverseStringByLength() method that takes a string as input and returns the reversed string. 
//It uses a StringBuilder to build the reversed string by iterating over the characters of the input string from the last character to the first.

//In the main() method, we define an example input string "Hello, World!" and call the reverseStringByLength() method to reverse it. The reversed string is then printed to the console.
