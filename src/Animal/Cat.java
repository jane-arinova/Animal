package Animal;

public class Cat {
    public static void main(String[] args) {
        System.out.println(reverseString("hubba"));
    }
    public static String reverseString(String string){
        String reverseText = "";
        for (int i = 0; i < reverseText.length(); i++) {
            reverseText = string.charAt(i) + reverseText;
            System.out.println("Hello");
        }

        return reverseText;
    }

}
