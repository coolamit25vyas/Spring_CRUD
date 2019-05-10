package com.fullstack.fsdev.manager;

import com.fullstack.fsdev.model.Actor;

import java.util.List;

public interface HomeManager {
    List<Actor> sayHello();
    Integer saveActor(Actor actor);
    Integer updateActor(int id,Actor actor);
    Integer deleteActor(int id);
}
