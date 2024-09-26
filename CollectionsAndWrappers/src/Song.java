/**
 * This is the Song class.  It represents a Song
 * object in an online music store
 * @author richard.weir
 *
 */
public class Song implements Comparable<Song> {

	private String title;
	private String artist;
	private double duration;
	private double price;	
	
	public Song() {
		title = "Why Didn't You Give a Real Value";
		artist = "Dummy";
		duration = 9999999;
		price = -1.00;
	}
	
	public Song(String t, String a, double d, double p) {
		title = t;
		artist = a;
		duration = d;
		price = p;
	}
	
	/**
	 * returns the title for this Song
	 * @return the title for this Song
	 */
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getPrice() {
		return price;
	}
	
	/**
	 * 
	 * @param price the price to be set for this album
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/* Every object has a toString method, which tells Java how
	 * to print this object in a print/println call
	 */
	public String toString() {
		String s = "";
		s += "Title: " + title + "\n";
		s += "Artist: " + artist + "\n";
		s += "Duration: " + duration + "\n";
		s += "Price: " + price + "\n";
		return s;
	}
	
	//compare Song titles
	public int compareTo(Song other) {		
		return this.title.compareTo(other.title);		
	}
	
}