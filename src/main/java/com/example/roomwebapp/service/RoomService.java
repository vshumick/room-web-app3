package com.example.roomwebapp.service;

import java.util.Comparator;
import java.util.List;

import com.example.roomwebapp.models.Room;
import com.example.roomwebapp.data.RoomRepository;
import org.springframework.stereotype.Service;

@Service
public class RoomService {
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        List<Room> lst = roomRepository.findAll();
        lst.sort(new Comparator<Room>() {
            public int compare(Room r1, Room r2) {
                return r1.getNumber().compareTo(r2.getNumber());
            }
        });
        return lst;
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}