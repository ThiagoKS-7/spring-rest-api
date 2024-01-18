package com.tks.springrest.controllers.room;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tks.springrest.data.Room;
import com.tks.springrest.data.RoomRepository;

@RestController
@RequestMapping("/v1")
public class RoomController {
    private final RoomRepository roomRepository;

    public RoomController(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @GetMapping("/rooms")
    public Iterable<Room> getRooms() {
        try {
            return roomRepository.findAll();

        } catch (Exception e) {
            throw e;
        }
    }
}
