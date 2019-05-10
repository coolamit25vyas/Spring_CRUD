package com.fullstack.fsdev.controller;

import com.fullstack.fsdev.manager.HomeManager;
import com.fullstack.fsdev.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    HomeManager homeManager;
    @GetMapping(value = "/sayHello")
    public List<Actor> sayHello(){
        return homeManager.sayHello();
    }

    @PostMapping(value = "/saveActor")
    public  Integer saveActor(@RequestBody Actor actor){
        return homeManager.saveActor(actor);
    }

@PutMapping(value = "/updateActor/{id}")
    public Integer updateActor (@PathVariable("id") int id,@RequestBody Actor actor){
        return homeManager.updateActor(id,actor);
    }

    @DeleteMapping(value = "/deleteActor/{id}")
    public  Integer deleteActor(@PathVariable("id") int id){
            return homeManager.deleteActor(id);

    }
}
