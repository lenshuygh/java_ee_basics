package com.lens.ee.service;

import com.lens.ee.domain.Cat;
import org.slf4j.Logger;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    static List<Cat> catList = new ArrayList<>();

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
        for(Cat c : catList){
            System.out.println(c);
        }
        return catList;
    }
}
