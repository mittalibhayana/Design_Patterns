package designpatterns.mediator;

public class Main {

	public static void main(String[] args) {
		IChatRoom room = new ChatRoom();
		User user1 = new ChatUser(room, "1", "Mittali");
		User user2 = new ChatUser(room, "2", "Himanshu");
		User user3 = new ChatUser(room, "3", "Paras");
		User user4 = new ChatUser(room, "4", "papa");
		
		room.addUser(user1);
		room.addUser(user2);
		room.addUser(user3);
		room.addUser(user4);
		
		user1.sendMsg("hey buddy", "2");
		user2.sendMsg("hey man!", "1");
		
		
		
	}
}
