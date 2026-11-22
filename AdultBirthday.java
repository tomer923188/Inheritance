public class AdultBirthday extends BirthdayCard {
	public AdultBirthday(String recipient, String sender, int age) {
		super(recipient,sender,age);
	}
	protected String greetingMsg() {
		return super.toString()+'\n'+"You haven't changed at all!";
	}
}
