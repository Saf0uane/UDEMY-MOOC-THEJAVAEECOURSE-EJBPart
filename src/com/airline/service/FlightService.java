package com.airline.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class FlightService
 */
@Stateless
@LocalBean
public class FlightService {

    /**
     * Default constructor.
     */
    public FlightService() {
        // TODO Auto-generated constructor stub
    }

    private Integer id            = 123456789;
    private String  from          = "Rabat";
    private String  to            = "Paris";
    private Integer price         = 2000;
    private Integer numOfSeats    = 200;
    private String  airplaneModel = "Wathever";

    public Integer getId() {
        return id;
    }

    public void setId( Integer id ) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom( String from ) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo( String to ) {
        this.to = to;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice( Integer price ) {
        this.price = price;
    }

    public Integer getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats( Integer numOfSeats ) {
        this.numOfSeats = numOfSeats;
    }

    public String getAirplaneModel() {
        return airplaneModel;
    }

    public void setAirplaneModel( String airplaneModel ) {
        this.airplaneModel = airplaneModel;
    }

    @Override
    public String toString() {
        return "FlightService [id=" + id + ", from=" + from + ", to=" + to + ", price=" + price + ", numOfSeats="
                + numOfSeats + ", airplaneModel=" + airplaneModel + "]";
    }

}
