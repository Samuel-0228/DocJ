public class CoinToss {  // Fixed class name
    // REQUIRED flip() function
    public static int flip() {
        return (int) (Math.random() * 2);  // 0=tails, 1=heads
    }
    
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        
        // Toss 100 times
        for (int i = 0; i < 100; i++) {
            int face = flip();  // Call function
            
            if (face == 1) {    // Problem says 1=heads
                System.out.println("Heads");  // Print each toss
                heads++;
            } else {
                System.out.println("Tails");
                tails++;
            }
        }
        
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
