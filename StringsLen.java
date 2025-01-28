public class StringsLen{
    public static void main(String[] args) {
        String str1 = "anjali";  // Original string
        char oldchar = 'i';  // Character to be replaced
        char newchar = 'o';  // Character to replace with
        String str2 = str1.replace(oldchar, newchar);  // Replace 'i' with 'o' in str1
        System.out.println("original String: " + str1);
        System.out.println("modified String: " + str2);

        String str3 = "world";  // Another string to concatenate
        System.out.println(str1.length());  // Print length of str1
        System.out.println(str1.concat(str3));  // Concatenate str1 and str3
        System.out.println(str1.toUpperCase());  // Convert str1 to uppercase

        System.out.println(str1.substring(2, 6));  // Print substring from index 2 to 5 of str1
    }
}
