public class BirthdayCard extends GreetingCard {
	private int age;
	public BirthdayCard(String recipient,String sender,int age) {
		super(recipient,sender);
		this.age = age;
	}
	protected String greetingMsg() {
		return "Happy "+age+"th"+" birthday";
	}
}
