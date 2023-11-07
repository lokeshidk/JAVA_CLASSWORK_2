public class STRING_FUNCTIONS {
    public static void main(String[] args) {
        String name = "Lokesh";
        String nam = "Lokesh";
        System.out.println(name.toLowerCase());
        //turns all the character to lower case
        System.out.println(name.toUpperCase());
        //turns all the character to upper case
        System.out.println(name.equals(nam));
        //compares if the two variables have same value or not
        System.out.println(name.equalsIgnoreCase(nam));
        //compares if the two variables have same value or not and ignores lower and upper case
        System.out.println(name.charAt(5));
        //prints fifth character
        System.out.println(name.indexOf('h'));
        //prints the position of the character
        System.out.println(name.contains("a"));
        //checks if the character is inside of a variable
        System.out.println(name.length());
        //prints total no of characters
    }
}
