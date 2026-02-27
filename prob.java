public class prob {  

    public static int flip() {
        return (int) (Math.random() * 2);  
    }
    
    public static void main(String[] args) {
        int heads = 0, tails = 0;
        
      
        for (int i = 0; i < 100; i++) {
            int face = flip(); 
            if (face == 1) {    
                 
                heads++;
            } else {
                
                tails++;
            }
        }
        
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
    }
}
