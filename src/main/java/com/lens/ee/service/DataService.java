package com.lens.ee.service;

import com.lens.ee.domain.Cat;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;

@Named
@Singleton
public class DataService {
    public List<Cat> catList = new ArrayList<>();

    @Inject
    private Logger logger;

    public void bootstrapData(){
        Cat cat = new Cat("Smiegel",16,"Black and white");
        catList.add(cat);
    }

    public void addCatElement(Cat cat){
        logger.debug("DataService.addCatElement() -> " + cat);
        catList.add(cat);
    }

    public List getCatList(){
        return catList;
    }
}
