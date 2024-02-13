package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?
  // Answer: An explicit constructor allows for creating instances of the object 
  // with custom input and settings. Otherwise, Java already provides a default constructor
  // that creates an instance of the object without any parameter input.

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    // TODO check argument validity
    if (capacity <= 0) {
      throw new IllegalArgumentException("Provide a correct capacity number.");
    }
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    // TODO
    if (capacity > size++) {
      return false;
    }
    data[rear++] = obj; 
    size++;
    return true;
  }

  @Override
  public E peek() {
    // TODO
    return data[front];
  }

  @Override
  public E poll() {
    // TODO
    E temp = data[front];
    data[front] = null;
    front++;
    rear--;
    return temp;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return data.length == 0;
  }

  @Override
  public boolean isFull() {
    // TODO
    return data.length >= capacity;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public int capacity() {
    return capacity;
  }

  @Override
  public List<E> asList() {
    // TODO implement using an ArrayList preallocated with the right size
    final ArrayList<E> result = new ArrayList<>(capacity);
    for (int i = 0; i < data.length; i++) {
      result.add(data[i]);
    }
    return result;
  }
}
