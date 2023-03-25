package org.example.Behavioral.Iterator;

public class Client {
    public static void runTest(){
        System.out.println("Executing query to get results");
        QueryResults resultSet = new QueryResultsImplementation();
        resultSet.fetchData();
        QueryResultsIterator iterator = resultSet.createIterator();
        while (!iterator.isDone()){
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}
