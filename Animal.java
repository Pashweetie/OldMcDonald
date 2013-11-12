public class Animal {
	
	private String phrase;
	private String name;

	public Animal(String phrase, String name){
		this.phrase = phrase;
		this.name = name;
	}

	public void speak() {
		System.out.println(name);
		System.out.println(phrase);
	}

	public void setPhrase(String phrase) {
		this.phrase = phrase;
	}
	public String phrase() {
		return this.phrase;
	}
}