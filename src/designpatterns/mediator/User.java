package designpatterns.mediator;

public abstract class User {
	
	private IChatRoom mediator;
	private String userId;
	private String userName;
	
	public User(IChatRoom mediator,String userId,String name) {
		this.mediator = mediator;
		this.userId = userId;
		this.userName = name;
	}
	
	
	public abstract void sendMsg(String msg, String userId);
	
	public abstract void receive(String msg);

	public IChatRoom getMediator() {
		return mediator;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
