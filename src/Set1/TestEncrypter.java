package Set1;

public class TestEncrypter {
    public static void main(String[] args) {

        String originalText="I am not a hum";
        String cipherText;

        cipherText = Encrypter.encrypt(originalText,3);

        System.out.println("Test Transposed is " + cipherText );//INAMAOHXMTUX

        originalText="I am not a human";

        cipherText = Encrypter.encrypt(originalText,3);

        System.out.println("Test Transposed is " + cipherText );//INAMAOHAMTUN

        originalText = "INAMAOHAMTUN";

        String decipherText = Encrypter.decrypt(originalText,3);

        System.out.println("decrypted Text " + decipherText );//IAMNOTAHUMAN
    }
}
