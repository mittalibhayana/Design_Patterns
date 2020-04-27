package designpatterns.mediator;

public class ChatUser extends User {

	public ChatUser(IChatRoom mediator, String userId, String name) {
		super(mediator, userId, name);
	}

	@Override
	public void sendMsg(String msg, String userId) {
		getMediator().sendMessage(msg, userId);

	}

	@Override
	public void receive(String msg) {
		System.out.println(this.getUserName()+"sends "+  msg);

	}

}
