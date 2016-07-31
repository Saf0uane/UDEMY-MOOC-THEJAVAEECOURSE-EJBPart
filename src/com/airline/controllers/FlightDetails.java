package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightLocal_ejb1;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet( "/FlightDetails" )
public class FlightDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @EJB( beanName = "flightStateless" )
    private FlightLocal_ejb1  fs;

    @EJB( beanName = "flightStateful" )
    private FlightLocal_ejb1  fsStateful;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
            IOException {

        PrintWriter out = response.getWriter();
        out.println( "The flights details servlet has been called " );
        out.println( "Local Flight details : " + fs.getFrom() + " to " + fs.getTo() );
        out.println( "Local Flight details : " + fsStateful.getFrom() + " to " + fsStateful.getTo() );

    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException,
            IOException {
        // TODO Auto-generated method stub
    }

}
