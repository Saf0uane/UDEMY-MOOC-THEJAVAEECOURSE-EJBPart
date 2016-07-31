package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightLocal;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet( "/FlightDetails" )
public class FlightDetails extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private FlightLocal       fs;

    private FlightLocal       fsStateful;

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

        try {

            Context context = new InitialContext();

            Object fsObject = context.lookup( "java:global/ejb1/flightStateless!com.airline.service.FlightLocal" );

            fs = (FlightLocal) fsObject;

            Object fsStatefulObject = context
                    .lookup( "java:global/ejb1/flightStateful!com.airline.service.FlightLocal" );

            fsStateful = (FlightLocal) fsStatefulObject;

        } catch ( NamingException e ) {
            System.out.println( "Naming Exception has occured in the lookup of out FlightService EJBs" );
            e.printStackTrace();
        }

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
