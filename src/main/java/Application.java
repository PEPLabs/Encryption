public class Application {
    /**
     * This main method is provided for manually testing your application.
     * Changes made here will not affect your test results.
     * @param args
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        String msg = "top secret message";
        System.out.println("Here's the original message: "+msg);
        String enc = lab.encrypt(msg);
        System.out.println("Here's the encrypted message: "+enc);
        String dec = lab.decrypt(enc);
        System.out.println("Here's the decrypted message: "+dec);
    }
}
