package Set1;

public class TestEncrypter {
    public static void main(String[] args) {

        String originalText="I am not a hum";
        String cipherText;

        cipherText = Encrypter.encryptRowColTranspose(originalText,3);

        System.out.println("Test Transposed is " + cipherText );//INAMAOHXMTUX

        originalText="I am not a human";

        cipherText = Encrypter.encryptRowColTranspose(originalText,3);

        System.out.println("Test Transposed is " + cipherText );//INAMAOHAMTUN

        originalText = "INAMAOHAMTUN";

        String decipherText = Encrypter.decryptRowColTranspose(originalText,3);

        System.out.println("decrypted Text " + decipherText );//IAMNOTAHUMAN

        String mapping = "RAHJMYUWKXNFQGEBOPZSDCTVLI";
        String txt = "I AM ME";
        String msg = Encrypter.encryptSimpleSubstitution(txt,mapping);

        System.out.println("Encrypted Text " + msg );//KRQQM
    }
}
