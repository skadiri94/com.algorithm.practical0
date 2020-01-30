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

        String encryptedText="", newText="";
        int txtCount=0,spaceLeft =0, numRow = 0;
        //plaintext.replaceAll(" ", ""); ;

        //Removing White Space from plainText

        for(int i = 0;i< plaintext.length(); i++){

            if(plaintext.charAt(i) != ' ') {
                newText += plaintext.charAt(i);
                txtCount++;
            }

        }

        if(txtCount % numColumns != 0) {
            spaceLeft = numColumns - (txtCount % numColumns);


            for (int i = 0; i < spaceLeft; i++) {

                newText +="x";
            }
        }


            numRow = newText.length()/numColumns;
        for(int col = 0; col < numColumns; col++){
            int index = col;
            for(int row = 0; row < numRow; row ++){
                encryptedText += newText.charAt(index);
                index += numColumns;
            }

        }

return encryptedText;
    }

    public static String decrypt(String ciphertext, int numColumns){
        String decrypt ="";
        int numRow = ciphertext.length()/numColumns;



        decrypt = encrypt(ciphertext,numRow);

        return decrypt;
    }
}
