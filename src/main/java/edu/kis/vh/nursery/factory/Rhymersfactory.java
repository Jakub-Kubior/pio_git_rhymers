package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

// TODO: Change name so every word start with capital letter
public interface Rhymersfactory {

    DefaultCountingOutRhymer getStandardRhymer();

    DefaultCountingOutRhymer getFalseRhymer();

    DefaultCountingOutRhymer getFIFORhymer();

    DefaultCountingOutRhymer getHanoiRhymer();

}
