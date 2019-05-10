package com.fullstack.fsdev.repository;

import com.fullstack.fsdev.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;


@Transactional
@Repository
public interface ActorRepository extends JpaRepository<Actor, Serializable> {


    Actor findByActorID(int id);

    @Modifying
    @Query("update Actor a set a.firstName = ?2, a.lastName = ?3 where a.actorID = ?1")
    int updateActorFirstNameAndLastNameByActorId(int id, String firstName, String lastName);

    int deleteActorByActorID(int id);
}
