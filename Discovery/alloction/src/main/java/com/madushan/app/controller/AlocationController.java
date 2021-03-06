package com.madushan.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.madushan.app.model.Allocation;
import com.madushan.app.service.AllocationService;

@RestController
@RequestMapping("/allocation")
public class AlocationController {

    @Autowired
    AllocationService allocationService;

    @RequestMapping(value = "/find/{employeeID}")
    public List<Allocation> findByID(@PathVariable Integer employeeID) {
        return allocationService.findByID(employeeID);
    }

    @RequestMapping(value = "/allocation", method = RequestMethod.POST)
    public Allocation save(@RequestBody Allocation allocation) {
        return allocationService.save(allocation);
    }
}
