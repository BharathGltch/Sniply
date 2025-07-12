package com.bharath.sniply.controllers;

import com.bharath.sniply.models.CreateSnipRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/snip")
public class SnipController {

    @PostMapping("/createSnip")
    public ResponseEntity createSnip(@RequestBody CreateSnipRequest createSnipRequest){
        System.out.println(createSnipRequest.getCode());
        return ResponseEntity.status(200).build();
    }
}
