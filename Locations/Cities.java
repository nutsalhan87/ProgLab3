package Locations;

import java.util.ArrayList;
import java.util.List;
import Stocks.*;
import java.util.Random;

public class Cities {
    public static City BRAHENVILLE;
    public static City DAVILON;
    public static City GRABENBERG;
    public static City SAN_KOMARIKA;

    static {
        BRAHENVILLE = new City("Брехенвиль") ;
        BRAHENVILLE.setRailStation(new RailStation("Станция города " + BRAHENVILLE.toString(), 2));
    }

    static {
        DAVILON = new City("Давилон") ;
        Market market = new Market("Маркет города " + DAVILON.toString(), 0.2f);
        Stocks[] stocksName = Stocks.values();
        Random rnd = new Random();
        for(int i = 0; i < stocksName.length; ++i) {
            market.setStock(new Stock(rnd.nextFloat() * 300, stocksName[i].toString()));
        }
        DAVILON.setMarket(market);
        DAVILON.setRailStation(new RailStation("Станция города " + DAVILON.toString(), 2));
        DAVILON.getRailStations().get(0).setTrain(new Train("Поезд"));
    }

    static {
        GRABENBERG = new City("Грабенберг") ;
        Market market = new Market("Маркет города " + GRABENBERG.toString(), 0.12f);
        Stocks[] stocksName = Stocks.values();
        Random rnd = new Random();
        for(int i = 0; i < stocksName.length; ++i) {
            market.setStock(new Stock(rnd.nextFloat() * 300, stocksName[i].toString()));
        }
        GRABENBERG.setMarket(market);
    }

    static {
        SAN_KOMARIKA = new City("Сан-Комарика") ;
        Market market = new Market("Маркет города " + SAN_KOMARIKA.toString(), 0.18f);
        Stocks[] stocksName = Stocks.values();
        Random rnd = new Random();
        for(int i = 0; i < stocksName.length; ++i) {
            market.setStock(new Stock(rnd.nextFloat() * 300, stocksName[i].toString()));
        }
        SAN_KOMARIKA.setMarket(market);
    }

    private Cities() {}

    static public ArrayList<City> getAllCities() {
        return new ArrayList<City>(List.of(BRAHENVILLE, DAVILON, GRABENBERG, SAN_KOMARIKA));
    }
}
