package com.fullstack.fsdev.service.impl;

import com.fullstack.fsdev.model.Actor;
import com.fullstack.fsdev.repository.ActorRepository;
import com.fullstack.fsdev.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {
    @Autowired
    ActorRepository actorRepository;

    /*  @Override
      public String sayHello(){
          return  "Hello,Amit";
      }*/
    @Override
    public List<Actor> sayHello() {
        String name = null;
        List<Actor> actorList = new ArrayList<>();
        List<Actor> actors = actorRepository.findAll();

        for (Actor actor : actors
        ) {
            if (actor.getFirstName().equalsIgnoreCase("Nick")) {
                //  name = actor.getFirstName()+' '+actor.getLastName();
                actorList.add(actor);
            }
        }
        return actorList;
    }

    @Override
    public Integer saveActor(Actor actor) {
        int status = 0;
        Actor saveActor = actorRepository.save(actor);
        if (null != saveActor) {
            status = 200;
        }
        return status;
    }

    @Override
    public Integer updateActor(int id, Actor actor)
    {
            int status = 0;
            Actor isActorPresent = actorRepository.findByActorID(id);
            if (isActorPresent != null)
            {
                status = actorRepository.updateActorFirstNameAndLastNameByActorId(id, actor.getFirstName(), actor.getLastName());
            }
        return status;
    }

    @Override
    public  Integer deleteActor(int id) {
            int status = actorRepository.deleteActorByActorID(id);
            if (status == 1) {
                return 200;
            }
            return 0;
        }

}
