
public class Datum {
	private int num;
	private String word;
	private double dec;
	
	public Datum(int num, String word, double dub) {
		this.num = num;
		this.word = word;
		this.dec = dub;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getDec() {
		return dec;
	}
	public void setDec(double dec) {
		this.dec = dec;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	public String toString() {
		String s = "";
		s += "Number: " + num + '\n';
		s += "Word: " + word + '\n';
		s += "Double: " + dec;
		return s;
	}
}
