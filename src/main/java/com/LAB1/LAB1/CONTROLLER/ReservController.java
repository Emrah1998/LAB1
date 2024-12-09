package com.LAB1.LAB1.CONTROLLER;

import com.LAB1.LAB1.MODEL.Request.CreateReservRequest;
import com.LAB1.LAB1.MODEL.Response.ReservResponse;
import com.LAB1.LAB1.MODEL.Response.ReservResponseWithDate;
import com.LAB1.LAB1.SERVICE.ReservServiceHandle;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/reservations")
public class ReservController {
    private final ReservServiceHandle reservService;

    @PostMapping
    public void saveReserv(@RequestBody CreateReservRequest reserv){
        reservService.saveReserv(reserv);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteReserv(@PathVariable Long id){
        reservService.deleteReserv(id);
    }

    @GetMapping("/{id}")
    public ReservResponse getReserv(@PathVariable Long id){
        return reservService.getReserv(id);
    }

    @GetMapping
    public ReservResponseWithDate getReservWithDate(LocalDateTime date){
        return reservService.getReservWithDate(date);
    }
}
