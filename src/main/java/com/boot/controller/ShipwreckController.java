package com.boot.controller;

import com.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by W055013 on 5/19/2017.
 */
@RestController
@RequestMapping("/api/v1/")
public class ShipwreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> getShipwrecks() {

        List<Shipwreck> wrecks = ShipwreckStub.list();
        return wrecks;
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck addShipwrecks (Shipwreck shipwreck) {

        return ShipwreckStub.create(shipwreck);

    }

    @RequestMapping(value = "shipwrecks/:id", method = RequestMethod.GET)
    public Shipwreck viewShipWreck(@PathVariable Long id) {

        return ShipwreckStub.get(id);
    }

    @RequestMapping(value = "shipwrecks/:id", method = RequestMethod.POST)
    public Shipwreck updateShipwreck(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {

        return ShipwreckStub.update(id, shipwreck);

    }

    @RequestMapping(value = "shipwrecks/:id", method = RequestMethod.DELETE)
    public Shipwreck deleteShipwreck(Long id){

        return ShipwreckStub.delete(id);

    }
}
