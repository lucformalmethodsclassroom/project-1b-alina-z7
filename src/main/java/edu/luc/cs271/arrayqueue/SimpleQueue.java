package edu.luc.cs271.arrayqueue;

import java.util.List;

/**
 * Generic interface for a first-in-first-out (FIFO) data structure where objects are inserted into
 * and removed from opposeite ends.
 *
 * <p>Based on Koffman & Wolfgang, Data Structures 3rd ed, Wiley 2015.
 *
 * @param <E> The element type
 */
public interface SimpleQueue<E> {
  /**
   * Adds an item to the end of the queue and returns a boolean to indicate whether the attempt
   * succeded.
   *
   * @pre True.
   * @post The queue is nonempty and one item larger than before.
   * @param obj The object to be inserted
   * @return true if the object has been inserted, false otherwise
   */
  boolean offer(E obj);

  /**
   * Returns the object at the front of the queue without removing it.
   *
   * @pre True.
   * @post The queue remains unchanged.
   * @return The object at the front of the queue if one exists, null otherwise
   */
  E peek();

  /**
   * Returns the object at the front of the queue and removes it.
   *
   * @pre True.
   * @post The queue is one item smaller than before.
   * @return The object at the front of the queue if one exists, null otherwise
   */
  E poll();

  /**
   * Returns true if the queue is empty; otherwise, returns false.
   *
   * @pre True.
   * @post The queue remains unchanged.
   * @return true if the queue is empty, false otherwise
   */
  boolean isEmpty();

  /**
   * Returns true if the queue is full; otherwise, returns false.
   *
   * @pre True.
   * @post The queue remains unchanged.
   * @return true if the queue is full, false otherwise
   */
  boolean isFull();

  /**
   * Returns the size of the queue.
   *
   * @pre True.
   * @post The queue remains unchanged.
   * @return the size of the queue
   */
  int size();

  /**
   * Returns the capacity (maximum size) of the queue.
   *
   * @pre True.
   * @post The queue remains unchanged.
   * @return the capacity of the queue
   */
  int capacity();

  /**
   * Returns a Java list containing the items currently in the queue. The item at the front of the
   * queue is the first item of the list (at index 0).
   *
   * @pre True.
   * @post The queue remains unchanged.
   * @return The list containing the items in the queue
   */
  List<E> asList();
}
