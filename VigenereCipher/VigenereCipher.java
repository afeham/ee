public class VigenereCipher {
    public static void main(String[] args){
        String message = "APPLES";
        String key = "DOG";
        String encrypted = encrypt(message, key);
        System.out.println("Your message: " + text);
        System.out.println("Encrypted Text: " + encrypted);
    }
    public static String encrypt(String s, String key){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i ++){
            //add shift
            char encrypted = s.charAt(i) + getShift(key, i) > 90 ? (char)((s.charAt(i) + getShift(key, i)) - 26) : (char)(s.charAt(i) + getShift(key, i));
            builder.append(encrypted);
        }
        return builder.toString();
    }
    private static int getShift(String key, int i) {
        return ((int)key.charAt(i % key.length())) - 65;
    }
}
