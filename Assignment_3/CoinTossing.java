import java.util.Scanner;

enum Coin {
   HEADS, TAILS
}

public class CoinTossing {
   // Returns a randomly generated Coin (HEADS or TAILS)
   public static Coin flip() {
      if (Math.random() < 0.5) {
         return Coin.HEADS;
      } else {
         return Coin.TAILS;
      }
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int heads = 0; // Counter for number of heads flips
      int tails = 0; // Counter for number of tails flips
      int flips = 0; // unused variable, can be removed
      System.out.println("How many times do you want to flip the coin?");
      int totalFlips = input.nextInt(); // Read user input for number of flips
      for (int i = 1; i <= totalFlips; i++) {
         Coin coin = flip(); // Flip the coin
         if (coin == Coin.HEADS) {
            heads++;
            System.out.println("Flip " + i + ": Heads");
         } else {
            tails++;
            System.out.println("Flip " + i + ": Tails");
         }
      }
      System.out.println("Heads: " + heads);
      System.out.println("Tails: " + tails);
   }
}
