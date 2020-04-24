package designpatterns.iterator;

public class Main {

	
	public static void main(String[] args) {
		Topic topic1 = new Topic("Hashtags");
		Topic topic2 = new Topic("Covid");
		Topic topic3 = new Topic("Nirankar");
		Topic topic4 = new Topic("Rabbi");
		Topic topic5 = new Topic("Nanak");
		Topic[] arr = {topic1,topic2,topic3, topic4,topic5};
		TopicArray topicList = new TopicArray(arr);
		Iterator<Topic> topicItertor = topicList.iterate();
		
		while(topicItertor.hasNext()) {
			System.out.println(topicItertor.next());
		}
	}
}
