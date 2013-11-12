public class runner {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		Cow cow = new Cow();
		Horse horse = new Horse();
		Swine swine = new Swine();
		Sheep sheep = new Sheep();
		Chicken chick = new Chicken();
		animals[0] = cow;
		animals[1] = horse;
		animals[2] = swine;
		animals[3] = sheep;
		animals[4] = chick;
		for (int i=0; i < animals.length; i++) {
			animals[i].speak();
		}
	}
}