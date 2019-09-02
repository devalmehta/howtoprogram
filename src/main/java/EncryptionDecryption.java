import java.util.Scanner;

public class EncryptionDecryption {

    public static void main(String[] args) {
        System.out.println("Enter four digit number to encrypt :");
        Scanner in = new Scanner(System.in);
        int phoneNumberToEncrypt = in.nextInt();
        int encryptedNumber = encryption(phoneNumberToEncrypt);
        System.out.println("Enter four digit number to decrypt : ");
        in = new Scanner(System.in);
        int phoneNumberToDecrypt = in.nextInt();
        int decryptedNumber = decryption(phoneNumberToDecrypt);
    }

    private static int decryption(int phoneNumberToDecrypt) {
        String stringNumberToDecrypt = String.valueOf(phoneNumberToDecrypt);
        char[] charArrayFromStringNumber = stringNumberToDecrypt.toCharArray();
        String firstStageDecryptionNumber =Character.toString(charArrayFromStringNumber[2]) + Character.toString(charArrayFromStringNumber[3])
                + Character.toString(charArrayFromStringNumber[0]) +Character.toString(charArrayFromStringNumber[1]);
        int firstStageDecryptionNumberInteger = Integer.parseInt(firstStageDecryptionNumber);
        int moduloFirstStageDecryption = firstStageDecryptionNumberInteger;
        String encryptedPhoneNumber = "";
        while(moduloFirstStageDecryption > 0) {
            int moduloPhoneNumber = moduloFirstStageDecryption % 10;
            encryptedPhoneNumber = Integer.toString(((moduloPhoneNumber %10) + 7) )+ encryptedPhoneNumber;
            moduloFirstStageDecryption = moduloFirstStageDecryption / 10;
        }
        System.out.println(encryptedPhoneNumber);
        return 0;
    }

    private static int encryption(int phoneNumber) {

        String encryptedPhoneNumber = "";
        int phoneNumberDivisor = phoneNumber;

        while(phoneNumberDivisor > 0) {
            int moduloPhonumber = phoneNumberDivisor % 10;
            encryptedPhoneNumber = Integer.toString((moduloPhonumber +7) %10) + encryptedPhoneNumber;
            phoneNumberDivisor = phoneNumberDivisor /10;

        }
        System.out.println("First stage encryption :" + encryptedPhoneNumber);

        String finalEncryptedPhoneNumber = Character.toString(encryptedPhoneNumber.charAt(2)) +Character.toString(encryptedPhoneNumber.charAt(3))
                 + Character.toString(encryptedPhoneNumber.charAt(0)) +Character.toString(encryptedPhoneNumber.charAt(1));
        System.out.println("Final encryption :" + finalEncryptedPhoneNumber);
        return Integer.parseInt(finalEncryptedPhoneNumber);
    }
}
