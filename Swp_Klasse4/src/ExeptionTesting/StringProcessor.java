package ExeptionTesting;

public class StringProcessor {

    public String reverse (String input){
        if (input == null){
            throw new NullPointerException("Input darf nicht Null sein!");
        }else {
            return new StringBuilder(input).reverse().toString();
        }
    }
}
