package com.smith.travel.agent.site.travelweb.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/travel")
public class Resource {

    @GetMapping(path = "/to")
    public String getTravelTo() {
        System.out.println("Endpoint  hit");
        return "SOME PLACE NICE";
    }
}
