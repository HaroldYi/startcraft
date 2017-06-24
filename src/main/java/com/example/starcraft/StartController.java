package com.example.starcraft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lji5317 on 2017-06-23.
 */
@RestController
public class StartController {

    @Autowired
    CreateUnit createUnit;

    @RequestMapping("/Zurg")
    public Zurg creatUnitZ() {
        return createUnit.createZergUnit();
    }

    @RequestMapping("/Terran")
    public Terran creatUnitT() {
        return createUnit.createTerranUnit();
    }

    @RequestMapping("/Protoss")
    public Protoss creatUnitp() {
        return createUnit.createProtossUnit();
    }
}