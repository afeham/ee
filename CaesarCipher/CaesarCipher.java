import java.util.Scanner;
 
public class CaesarCipher
{
    public static final String ABC = "abcdefghijklmnopqrstuvwxyz";
  
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text to encrypt: ");
        String text = new String();
        text = sc.next();
        System.out.println("Encrypted text: " + encrypt(text, 2));
        sc.close();
    }
         
    public static String encrypt(String plainText, int shiftKey)
    {
        plainText = plainText.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ABC.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ABC.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }
 
  
}
