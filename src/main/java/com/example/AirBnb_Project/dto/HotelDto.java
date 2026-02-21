package com.example.AirBnb_Project.dto;

import com.example.AirBnb_Project.entity.HotelContactInfo;
import com.example.AirBnb_Project.entity.Room;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class HotelDto {
    private Long id ;
    private String name ;

    private String city;

    private String[] photos;

    private String[] amenities;

    private HotelContactInfo hotelContactInfo;

    private boolean isActive;

    private List<Room> rooms;
}
