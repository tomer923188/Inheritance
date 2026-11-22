public class WeddingCard extends GreetingCard{
	private String bride;
	private String groom;
	private String recipient = bride+"&"+groom;
	public WeddingCard(String bride,String groom,String sender) {
		super(sender,sender);
		this.recipient = recipient;
		this.bride = bride;
		this.groom = groom;
	}
	public void setRecipient(String bride, String groom) {
		this.bride = bride;
		this.groom = groom;
	}
	protected String greetingMsg() {
		return "may you live happily ever after";
	}
}
