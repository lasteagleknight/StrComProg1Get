package finalProject;

public class Memory {
	
	int cardHolder, card;
	
	public Memory(int cardholder, int card ){
		this.cardHolder = cardholder;
		this.card = card;
	}

	public int getCardHolder() {
		return cardHolder;
	}

	public void setCardHolder(int cardHolder) {
		this.cardHolder = cardHolder;
	}

	public int getCard() {
		return card;
	}

	public void setCard(int card) {
		this.card = card;
	}
}
