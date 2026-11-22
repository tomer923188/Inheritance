public class YouthBirthday extends BirthdayCard {
	public YouthBirthday(String recipient, String sender, int age) {
		super (recipient,sender,age);
	}
	protected String greetingMsg() {
		return super.toString()+'\n'+"How you have grown!";
	}
}
