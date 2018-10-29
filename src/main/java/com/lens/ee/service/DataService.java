package com.lens.ee.service;

import com.lens.ee.domain.Cat;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<Cat> catList = new ArrayList<>();

    public void addCatElement(Cat cat){
        catList.add(cat);
    }

    public List getCatList(){
        return catList;
    }
}
