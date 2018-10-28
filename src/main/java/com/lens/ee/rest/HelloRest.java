package com.lens.ee.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class HelloRest {
    @GET
    public String Hello(){
        return ("a RESTfull hello!");
    }
}
