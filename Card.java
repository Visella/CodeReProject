public class Card {
    private String color;
    private int number;

    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Card(String color, int number) {
        this.color = color;
        this.number = number;
    }
}
