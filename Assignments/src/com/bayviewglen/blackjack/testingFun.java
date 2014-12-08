package com.bayviewglen.blackjack;

public class testingFun {
	public static int CLUBS = 1;
    public static int SPADES = 2;
    public static int HEARTS = 3;
    public static int DIAMONDS = 4;
    public static int BLACKJACK_LUCKY_NUMBER_ONE = 21 - 10;
    public static int BLACKJACK_LUCKY_NUMBER_TWO = 21 - 11;
    public static int DEALER_MAX = 17;
    public static int BUST = 21;
    public static int ACE_LOW = 1;
    public static int ACE_HIGH = 0;
    public static int ACE = 1;
    public static int JACK = 11;
    public static int QUEEN = 12;
    public static int KING = 13;
    public static int FACE_CARD_POINTS = 25;
    public static int TOTAL_CARDS_PER_SUITE = 13;
    public static int TOTAL_NUMBER_OF_SUITES = 4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dealersCards = "";
		int playersPoints = 0;
		String playersCards = "";
		int dealersPoints = 0;
		int ace = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, jack = 0, queen = 0, king = 0;
		
        while(playersPoints < 122 && dealersPoints < 122){
        	int card1 = (int)(Math.random() * TOTAL_CARDS_PER_SUITE + 1);
		if (card1 == ACE) {
            playersCards += "A\t";
            playersPoints += 0;
            ace++;
        } else if (card1 == JACK) {
            playersCards += "J\t";
            playersPoints += FACE_CARD_POINTS;
            jack++;
        } else if (card1 == QUEEN) {
            playersCards += "Q\t";
            playersPoints += FACE_CARD_POINTS;
            queen++;
        } else if (card1 == KING) {
            playersCards += "K\t";
            playersPoints += FACE_CARD_POINTS;
            king++;
        } else if(card1 == 9){
        	playersCards += "9\t";
        	playersPoints += 0;
        	nine++;
        }else if(card1 == 2){
        	playersCards += "2\t";
        	playersPoints += 30;
        	two++;
        }else if(card1 == 3 || card1 == 5 || card1 == 7){
        	playersCards += "" + card1 + "\t";
        	playersPoints += card1 * 5;
        	if(card1 == 3){
        		three++;
        	}else if(card1 == 5){
        		five++;
        	}else{
        		seven++;
        	}
        }else if(card1 == 4 || card1 == 6 || card1 == 8){
        	playersCards += "" + card1 + "\t";
        	playersPoints += card1 / 2 * 5;
        	if(card1 == 4){
        		four++;
        	}else if(card1 == 6){
        		six++;
        	}else{
        		eight++;
        	}
        }else{
            playersCards += "" + card1 + "\t";
            playersPoints += card1;
        }
		if(playersPoints > 122){
			break;
		}
        int card2 = (int)(Math.random() * TOTAL_CARDS_PER_SUITE + 1);
        if (card2 == ACE) {
            dealersCards += "A\t";
            dealersPoints += 0;
            ace++;
        } else if (card2 == JACK) {
            dealersCards += "J\t";
            dealersPoints += FACE_CARD_POINTS;
            jack++;
        } else if (card2 == QUEEN) {
            dealersCards += "Q\t";
            dealersPoints += FACE_CARD_POINTS;
            queen++;
        } else if (card2 == KING) {
            dealersCards += "K\t";
            dealersPoints += FACE_CARD_POINTS;
            king++;
        } else if(card2 == 9){
        	dealersCards += "9\t";
        	dealersPoints += 0;
        	nine++;
        }else if(card2 == 2){
        	dealersCards += "2\t";
        	dealersPoints += 30;
        	two++;
        }else if(card2 == 3 || card2 == 5 || card2 == 7){
        	dealersCards += "" + card2 + "\t";
        	dealersPoints += card2 * 5;
        	if(card2 == 3){
        		three++;
        	}else if(card2 == 5){
        		five++;
        	}else{
        		seven++;
        	}
        }else if(card2 == 4 || card2 == 6 || card2 == 8){
        	dealersCards += "" + card2 + "\t";
        	dealersPoints += card2 / 2 * 5;
        	if(card2 == 4){
        		four++;
        	}else if(card2 == 6){
        		six++;
        	}else{
        		eight++;
        	}
        }else{
            dealersCards += "" + card2 + "\t";
            dealersPoints += card2;
        }
        }
        System.out.println("Player:\t\t" + playersCards + "\n\n" + "Dealer:\t\t" + dealersCards + "\n\nAces:\t" + ace + "\nOnes:\t" + two + "\nThrees:\t" + three + "\nFours:\t" + four + "\nFives:\t" + five + "\nSixes:\t" + six + "\nSevens:\t" + seven + "\nEights:\t" + eight + "\nNines:\t" + nine + "\nTens:\t" + ten + "\nJacks:\t" + jack + "\nQueens:\t" + queen + "\nKings:\t" + king );
	}

	
}
