package datastructure;

import java.util.HashMap;

public class LRU {

	
	class Node{
		int key;
		int value;
		Node prev;
		Node next;
		
		public Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	
	}
	
	private HashMap<Integer,Node> map;
	private Node head;
	private Node tail;
	private int count;
	private int capacity;
	
	public LRU(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>(capacity);
		head = new Node(0,0);
		tail = new Node(0,0);
		head.next = tail;
		tail.prev = head;
		head.prev= null;
		tail.next=null;
		count=0;
	}
	
	public int getElem(int key) {
		if(map.get(key) != null) {
			Node node = map.get(key);
			deleteNode(node);
			addToHead(node);
			return node.value;
		}else {
			return -1;
		}
	}
	
	
	public void addToHead(Node node) {
		 node.next = head.next; 
	        node.next.prev = node; 
	        node.prev = head; 
	        head.next = node; 
	}

	public void deleteNode(Node node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
	}
	public void setElem(int key, int value) {
		if(map.get(key) != null) {
			Node node = map.get(key);
			node.value = value;
			deleteNode(node);
			addToHead(node);
		}else {
			Node node = new Node(key,value);
			map.put(key, node);
			if(count < capacity) {
				count++;
				addToHead(node);
			}else {
				map.remove(tail.prev.key);
				deleteNode(tail.prev);
				addToHead(node);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		LRU lru = new LRU(2);
		lru.setElem(2, 30);
		lru.setElem(3, 40);
		System.out.println(lru.getElem(3));
		lru.setElem(4, 50);
		System.out.println(lru.getElem(2));
		
		System.out.println(lru.getElem(5));
		
		
	}
}
