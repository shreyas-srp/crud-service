package com.example.hotel.controller;

import com.example.hotel.booking;
import com.example.hotel.bookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path="/bookings")
@EnableJpaRepositories({"com.example.hotel"})
@EnableSpringDataWebSupport
public class MainController {

    @Autowired
    bookingRepo repo;

    @GetMapping(path = "/all")
    public @ResponseBody
    ResponseEntity<List<booking>> search() {
        List<booking> bookings = repo.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(bookings);
    }

}
