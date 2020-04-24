package designpatterns.iterator;

public class TopicArray implements List<Topic> {

	
	  private Topic[] topics;
	     
	    public TopicArray(Topic[] topics)
	    {
	        this.topics = topics;
	    }
	    
	    
	@Override
	public Iterator<Topic> iterate() {
		return new TopicIterator(topics);
	}

}
