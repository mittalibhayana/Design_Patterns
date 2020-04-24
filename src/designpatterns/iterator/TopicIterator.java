package designpatterns.iterator;

public class TopicIterator implements Iterator<Topic> {

	private Topic[] topics;
	private int position;

	public TopicIterator(Topic[] topics) {
		this.topics = topics;
		position = 0;
	}

	@Override
	public void reset() {
		position = 0;
	}

	@Override
	public Topic next() {
		return topics[position++];
	}

	@Override
	public boolean hasNext() {
		if (position > topics.length-1) {
			return false;
		}
		return true;
	}

	@Override
	public Topic currentElem() {
		return topics[position];
	}

}
