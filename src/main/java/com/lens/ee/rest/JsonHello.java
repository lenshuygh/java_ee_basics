package com.lens.ee.rest;

import com.lens.ee.domain.Cat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("jsonHello")
public class JsonHello {
    @GET
    @Produces("application/json")
    public String Hello(){
        return new String("hello json");
    }

    @GET
    @Path("cat")
    @Produces
    public Object getObject(){
        Cat cat = new Cat("Thor",14,"Black");
        return (Object) cat;
    }
}
