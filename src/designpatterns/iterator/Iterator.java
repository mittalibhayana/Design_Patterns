package designpatterns.iterator;

public interface Iterator<E> {
 public void reset();
 public E next();
 public boolean hasNext();
 public E currentElem();
}
