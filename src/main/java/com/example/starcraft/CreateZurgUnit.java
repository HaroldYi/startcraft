package com.example.starcraft;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by lji5317 on 2017-06-24.
 */
@Service
public class CreateZurgUnit implements CreateUnit {
    @Override
    public Zurg createZergUnit() {

        Random random = new Random();

        Zurg zurg = new Zurg();
        zurg.setSeq(random.nextInt());
        zurg.setName("DRON");
        zurg.setStatus("OK");
        zurg.characteristic();

        return zurg;
    }

    @Override
    public Terran createTerranUnit() {

        Random random = new Random();
        Terran terran = new Terran();
        terran.setSeq(random.nextInt());
        terran.setName("commandCentre");
        terran.setStatus("OK");
        terran.characteristic();

        return terran;
    }

    @Override
    public Protoss createProtossUnit() {
        Random random = new Random();
        Protoss protoss = new Protoss();
        protoss.setSeq(random.nextInt());
        protoss.setName("commandCentre");
        protoss.setStatus("OK");
        protoss.characteristic();

        return protoss;
    }

}
