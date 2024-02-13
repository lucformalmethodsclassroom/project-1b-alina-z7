package edu.luc.cs271.arrayqueue;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import net.jqwik.api.*;
import net.jqwik.api.constraints.*;
import net.jqwik.api.state.*;


class TestSimpleQueueJqwik {

  class OfferAction implements Action.Independent<SimpleQueue<String>> {
    @Override
    public boolean precondition(final SimpleQueue<String> queue) {
      // TODO implement precondition for offer method
      return true;
    }
    @Override
    public Arbitrary<Transformer<SimpleQueue<String>>> transformer() {
      final var offerElements = Arbitraries.strings().alpha().ofLength(5);
      return offerElements.map(element -> Transformer.mutate(
        String.format("offer(%s)", element),
        queue -> {
          // TODO capture state before offer, perform, and check postcondition

        }
      ));
    }
  }

  private Action<SimpleQueue<String>> poll() {
    return Action.<SimpleQueue<String>>builder()
      .describeAs("poll")
      .justMutate(queue -> {
        // TODO capture state before poll, perform, and check postcondition

      });
  }

  // TODO extra credit: apply property to different queue capacities
  @Property
  void checkSimpleQueue(@ForAll("simpleQueueActions") final ActionChain<SimpleQueue<String>> chain) {
    // TODO insert observable data invariant(s) for 0 <= size <= capacity
    chain
    
    .run();
  }

  @Provide
  Arbitrary<ActionChain<SimpleQueue<String>>> simpleQueueActions() {
    return ActionChain
      .<SimpleQueue<String>>startWith(() -> new FixedArrayQueue<String>(1))
      .withAction(new OfferAction())
      .withAction(poll());
  }
}
