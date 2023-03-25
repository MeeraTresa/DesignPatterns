package org.example.Behavioral.Iterator;

public interface QueryResultsIterator {
    String first();
    String next();
    String currentItem();
    boolean isDone();

}
