
public class GreetingCard {
	private String recipient;
	private String sender;
	public GreetingCard(String recipient,String sender) {
		this.recipient = recipient;
		this.sender = sender;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	protected String greetingMsg() {
		return "Best Greetings!";
	}
	public String toString() {
		return "Dear "+recipient+","+'\n'+greetingMsg()+'\n'+ sender;
	}
}
