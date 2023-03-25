package org.example.Behavioral.Iterator;

import java.util.ArrayList;

public class QueryResultsImplementation implements QueryResults{
    private ArrayList<String> results = new ArrayList<>();
    @Override
    public QueryResultsIterator createIterator() {
        return new QueryResultsIteratorImplementation(results);
    }

    @Override
    public void fetchData() {
        results.add("Item 1");
        results.add("Item 2");
        results.add("Item 3");
        results.add("Item 4");
    }
}
