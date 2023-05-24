public class ServerNameGenerator {

    public static String[] adjectives = {"Ashamed", "Adorable", "Attractive", "Beautiful", "Awful", "Aggressive", "Cruel", "Clever", "Tasty", "Jealous"};

    public static String[] nouns = {"doctor", "teacher", "girl", "dog", "cat", "man", "cow", "lake", "school", "home"};

    public static String randElem(String[] words){
        return words[(int) Math.floor(Math.random() * (words.length - 1))];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name: ");
        System.out.println(randElem(adjectives) + " - " + randElem(nouns));
    }
}
