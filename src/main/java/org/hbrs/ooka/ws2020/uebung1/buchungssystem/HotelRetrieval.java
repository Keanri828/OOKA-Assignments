package main.java.uebung1.buchungssystem;

import main.java.uebung1.extern.Caching;
import main.java.uebung1.hotel.Hotel;

public class HotelRetrieval implements Hotelsuche, UsingDBAccess {
    Caching c_port;

    public HotelRetrieval(Caching c_port) {
        this.c_port = c_port;
    }

    @Override
    public Hotel[] getHotelByName(String name) {
        return new Hotel[0];
    }
}