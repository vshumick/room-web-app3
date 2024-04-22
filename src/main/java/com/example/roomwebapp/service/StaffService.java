package com.example.roomwebapp.service;

import java.util.List;

import com.example.roomwebapp.models.StaffMember;
import com.example.roomwebapp.data.StaffRepository;
import org.springframework.stereotype.Service;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}