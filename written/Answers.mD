**FixedArrayQueue Answers**

1. Why does `FixedArrayQueue` require an explicit constructor?

    As the name implies, 'FixedArrayQueue', "fixed arrays" require a certain capacity size to initialize an instance of it, since an array is a fixed contigious section of memory and a certain number n is required to reserve that space for further use. Therefore, an explicit constructor is required to provide n, or else the internal array cannot be used.

2. What happens when you offer an item to a full `FixedArrayQueue`?

   When you attempt to offer an item to a full 'FixedArrayQueue', it will throw an error,
   since it adding it will reach beyond capacity.

3. What happens when you poll an empty `FixedArrayQueue`?

    When you attempt to poll an empty 'FixedArrayQueue' it will return a null element,
    since there is nothing in the array to show and return.

4. What is the time and (extra) space complexity of each of the `FixedArrayQueue` methods?

    |   Methods  |  T(n) |  S(n)  |
    |------------|-------|--------|
    | offer()    |  O(n) |  O(1)  |
    | peek()     |  O(1) |  O(1)  |
    | poll()     |  O(n) |  O(1)  |
    | isEmpty()  |  O(1) |  O(1)  |
    | isFull()   |  O(1) |  O(1)  |
    | size()     |  O(1) |  O(1)  |
    | capacity() |  O(1) |  O(1)  |
    | asList()   |  O(1) |  O(n)  |
    
5. How exhaustively does the `TestSimpleQueue` test suite test the implementation, both conceptually and in terms of actual coverage?

    The 'TestSimpleQueue' test suite tests the implementation progressively with different test cases that cover with offering and polling the elements and checking every now and then if the queue is empty. In terms of actual coverage, it doesn't seem to cover for large datasets of lets say 1,000 or 10,000 elements
    just to make sure that it would have the same performance and efficiency in comparison with a sample dataset of 5-10 elements.

6. How exhaustively does the `TestSimpleQueueJqwik` test suite test the implementation, both conceptually and in terms of actual coverage?

    The 'TestSimpleQueueJqwik' test suite tests the implementation in a great fashion since it considers the preconditions and postconditions of the methods that are important for finding edge cases that may break the function. It works similar to 'TestSimpleQueue' but much more efficiently with a general dataset. However, same could be said for the actual coverage as said for the 'TestSimpleQueue', larger datasets to measure performance and scalability.

7. What kind of test cases does the `simpleQueueActions` method generate?

    The 'simpleQueueActions' method generates test cases where there is only 1 element and polls it, mostly to see if the fixed array will assert emptiness or throw null element, or otherwise.
