/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 *
 * @author RS-Kiran
 */
@Path("/customer")
public class Customer {
    
    
    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    public String getService(){
        return  "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }
    
    
    @GET
    @Path("/html")
    @Produces(MediaType.TEXT_HTML)
    public String getHtml(){
         return "<html> " + "<title>" + "Hello Jersey" + "</title>"
        + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
    }
    
    @GET
    @Path("/plain")
    @Produces(MediaType.TEXT_PLAIN)
    public String getPlain(){
        return "This is from plain services";
    }
}
