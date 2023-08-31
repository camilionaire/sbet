package com.camilo.lil.sbet.landon.roomwebapp.service;

import com.camilo.lil.sbet.landon.roomwebapp.models.Position;
import com.camilo.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<StaffMember> staff = new ArrayList<>();

    static {
        staff.add(new StaffMember(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jane", "Doe", Position.HOUSEKEEPING));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Joe", "Schmoe", Position.FRONT_DESK));
        staff.add(new StaffMember(UUID.randomUUID().toString(), "Jack", "Sprat", Position.SECURITY));
    }

    public List<StaffMember> getAllStaff() { return staff; }
}
