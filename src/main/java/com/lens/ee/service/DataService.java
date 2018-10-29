package com.lens.ee.service;

import com.lens.ee.domain.Cat;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<Cat> catList = new ArrayList<>();

    public void bootstrapData(){
        Cat cat = new Cat("Smiegel",16,"Black and white");
        catList.add(cat);
    }

    public void addCatElement(Cat cat){
        for(Cat c : catList){
            System.out.println(c);
        }
        catList.add(cat);
    }

    public List getCatList(){
        bootstrapData();
        for(Cat c : catList){
            System.out.println(c);
        }
        return catList;
    }
}
