package com.lens.ee.rest;

import com.lens.ee.domain.Cat;
import com.lens.ee.service.DataService;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("data")
public class DataRest {

    @Inject
    private DataService dataService;

    @Inject
    private Logger logger;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Cat> getCats(){
        return dataService.getCatList();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String addCat(Cat cat){
        logger.debug("Cat -> " + cat);
        dataService.addCatElement(cat);
        return "ok";
    }
}
