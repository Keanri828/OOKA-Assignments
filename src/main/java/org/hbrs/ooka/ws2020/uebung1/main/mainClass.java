package main.java.uebung1.main;

import main.java.uebung1.buchungssystem.*;

public class mainClass {
    public static void main(String[] args) {
        // init the whole structure
        // DBAccess db = new DBAccess();
        Cache c = new Cache();
        CachingPort c_port = new CachingPort(c);
        HotelRetrieval hotelRetrievalObject = new HotelRetrieval(c_port);
        HotelRetrievalPort h_search_port = new HotelRetrievalPort(hotelRetrievalObject);

        System.out.println("Hello User!");
    }
}