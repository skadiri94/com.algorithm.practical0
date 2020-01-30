package Set1;

public class Encrypter {

    /**
     * The mothod takes in a String and remove the white spaces between each character
     * and return and encrypted plaintext
     * @param plaintext the String text to be transposed
     * @param numColumns the number of column the plaintext will be transposed.
     * @return the encrypted text returned
     */
    public static String encrypt(String plaintext, int numColumns){

        String encryptedText="";

        //Removing White Space from plainText

        for(int i = 0;i< plaintext.length(); i++){

            if(plaintext.charAt(i) != ' ')
                encryptedText += plaintext.charAt(i);

        }
return encryptedText;
    }
}
