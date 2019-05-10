package com.fullstack.fsdev.service;

import com.fullstack.fsdev.model.Actor;

import java.util.List;

public interface HomeService {
    //Sept -1
    //In this all services writes here in service implementation , And called from here


    //for  retrieve data
    List<Actor> sayHello();

    //insert new data
    Integer saveActor(Actor actor);

    //update the data by id  so we need id which one wants to be update
    // the Actor's information so that's why we passed the actor instance here.
    Integer updateActor(int id,Actor actor);

    //for destroy or delete the data from the table.
    Integer deleteActor(int id);
}
