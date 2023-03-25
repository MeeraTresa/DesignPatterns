package org.example.Behavioral.Iterator;

import java.util.ArrayList;

public class QueryResultsIteratorImplementation implements QueryResultsIterator{
    private ArrayList<String> results;
    private int cursor;
    private int max;
    QueryResultsIteratorImplementation(ArrayList<String> results){
        this.results = results;
        cursor = 0;
        max = results.size();
    }
    @Override
    public String first() {
        return results.get(0);
    }

    @Override
    public String next() {
        cursor++;
        if(cursor<max){
            return results.get(cursor);
        }
        return "end";

    }

    @Override
    public String currentItem() {
        return results.get(cursor);
    }

    @Override
    public boolean isDone() {
        return (cursor==max);
    }
}
