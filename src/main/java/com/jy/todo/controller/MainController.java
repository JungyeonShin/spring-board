package com.jy.todo.controller;

import com.jy.todo.service.MainService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/")
@AllArgsConstructor
public class MainController {

    private final MainService mainService;

    @RequestMapping(value = "test")
    public ResponseEntity getTest() {

        HashMap value = mainService.getTestValue();
        System.out.println("\n\n\n\nTEST :: " + value);


        List list = new ArrayList<HashMap>();
        Map map = new HashMap<String, Object>();
        map.put("TEST", "A");
        map.put("MAP", "B");
        map.put("KILL", "C");

        list.add(map);

        return ResponseEntity.status(HttpStatus.OK).body(value);
    }
}
