package designpatterns.mediator;

import java.util.HashMap;

public class ChatRoom implements IChatRoom {

	HashMap<String, User> userMap = new HashMap<>();

	@Override
	public void sendMessage(String msg, String userId) {
		User user = userMap.get(userId);
		user.receive(msg);
	}

	@Override
	public void addUser(User user) {
		userMap.put(user.getUserId(), user);
	}

}
