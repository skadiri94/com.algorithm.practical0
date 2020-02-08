package Set2;

public class DeckTest {

    public static void main(String[] args) {

        Deck dk = new Deck();

        System.out.println(dk.toString());

        dk.shuffleDeck();
        System.out.println("After Shuffle" + dk.toString());
    }
}
