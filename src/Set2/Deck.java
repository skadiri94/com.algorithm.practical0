package Set2;

public class Deck {



    private Card [] myCard = new Card[53];

    public Deck(){
        String suit = "";
        int i = 1;

                for(int j = 1;j<=4;j++){
                    if(j ==1)
                        suit = "Hearts";

                    else if(j == 2)
                        suit = "Diamonds";

                    else if(j ==3)
                        suit = "Clubs";

                    else
                        suit = "Spades";
                    for(int k = 1;k <=13;k++){

                        myCard[i] = new Card(k,suit);

                        i++;
                    }


                }



    }

    private void setMyCard(Card[] myCard) {
        this.myCard = myCard;
    }

    public Card[] getMyCard() {
        return myCard;
    }

    public void shuffleDeck(){
        Card temp,temp2;
        int index;

        for(int i = 1; i <myCard.length;i++) {
            temp = myCard[i];
            index = (int) (Math.random() * 52) + 1;
            System.out.println("Curr Random " + index);

           if(index != i ) {
                //temp2 = myCard[index];
                myCard[i] = myCard[index];
                 myCard[index]= temp;
           }

        }
    }

    public String toString(){
        String deck = "";

        for(int i = 1;i < myCard.length; i ++)
        {
            deck += myCard[i].toString() + "\n";
        }
        return deck;
    }

}
