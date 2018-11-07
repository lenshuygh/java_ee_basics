package com.lens.ee.service;

import com.lens.ee.domain.Cat;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Named
@Singleton
public class DataService {
    public List<Cat> catList = new ArrayList<>();

    @Inject
    private Logger logger;

    public void bootstrapData(){
        Cat cat = new Cat(0,"Smiegel",16,"Black and white");
        catList.add(cat);
    }

    public void addCatElement(Cat cat){
        logger.debug("DataService.addCatElement() -> " + cat);
        catList.add(cat);
    }

    public List getCatList(){
        return catList;
    }

    public Cat getCat(int id) throws Exception {
        Optional<Cat> catOptional = null;
        for(Cat c : catList){
            if(c.getId() == id) {
                catOptional = Optional.of(c);
            }
        }
        if(catOptional.isPresent()){
            return catOptional.get();
        }else{
            throw new Exception("Searched element not found");
        }
    }

    public void deleteCat(int id) throws Exception {
        Cat c = getCat(id);
        catList.remove(c);
    }

    public int updateCat(int id, Cat newCat) throws Exception {
        Cat originalCat = getCat(id);
        logger.debug("cat found to update -> " + originalCat);
        logger.debug("New cat data -> " + newCat);
        catList.remove(originalCat);
        catList.add(newCat);
        return 1;
    }
}
