import java.util.Random;

public class RandomSentenceGenerator {

    public static void main(String[] args) {
        // Define arrays for articles, nouns, verbs, and prepositions
        String[] articles = {"the", "a", "one", "some", "any"};
        String[] nouns = {"boy", "girl", "dog", "town", "car"};
        String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositions = {"to", "from", "over", "under", "on"};
        // Create a new Random object to generate random numbers
        Random rand = new Random();

        // Loop 20 times to generate 20 sentences
        for (int i = 0; i < 20; i++) {
            String sentence = "";
            sentence += articles[rand.nextInt(articles.length)] + " ";
            sentence += nouns[rand.nextInt(nouns.length)] + " ";
            sentence += verbs[rand.nextInt(verbs.length)] + " ";
            sentence += prepositions[rand.nextInt(prepositions.length)] + " ";
            sentence += articles[rand.nextInt(articles.length)] + " ";
            sentence += nouns[rand.nextInt(nouns.length)] + ".";
            // Capitalize the first letter of the sentence and add a period at the end
            sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
            // Print the sentence to the console
            System.out.println(sentence);
        }
    }
}
