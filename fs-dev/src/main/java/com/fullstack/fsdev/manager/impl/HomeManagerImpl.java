package com.fullstack.fsdev.manager.impl;

import com.fullstack.fsdev.manager.HomeManager;
import com.fullstack.fsdev.model.Actor;
import com.fullstack.fsdev.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Component
public class HomeManagerImpl implements HomeManager {
    @Autowired
    private HomeService homeService;

    @Override
    public List<Actor> sayHello(){
        return homeService.sayHello();
    }
    @Override
    public  Integer saveActor(Actor actor){
        return homeService.saveActor(actor);
    }

    public Integer updateActor(int id,Actor actor){
        return homeService.updateActor(id,actor);
    }
    @Override
    public Integer deleteActor(int id){
        return  homeService.deleteActor(id);
    }
}
