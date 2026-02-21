package com.example.AirBnb_Project.Controller;

import com.example.AirBnb_Project.Service.FavouriteService;
import com.example.AirBnb_Project.dto.FavouriteDto;
import com.example.AirBnb_Project.dto.HotelDto;
import com.example.AirBnb_Project.entity.Favourite;
import com.example.AirBnb_Project.entity.Hotel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/favourites")
@RequiredArgsConstructor
public class FavouriteController {
    private final FavouriteService favouriteService;
    @GetMapping
    public ResponseEntity<List<FavouriteDto>> getAllFav(){
        return ResponseEntity.ok(favouriteService.getAllFav());
    }
    @PostMapping
    public ResponseEntity<String> addFavorite(@RequestBody FavouriteDto request) {
        try {
            String message = favouriteService.addFavorite(request);
            return ResponseEntity.ok(message);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping("/{userId}/{hotelId}")
    public ResponseEntity<String> removeFavorite(@PathVariable Long userId, @PathVariable Long hotelId) {
        try {
            String message = favouriteService.removeFavorite(userId, hotelId);
            return ResponseEntity.ok(message);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
