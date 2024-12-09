package com.LAB1.LAB1.SERVICE;

import com.LAB1.LAB1.DAO.Entity.ReservEntity;
import com.LAB1.LAB1.MODEL.Request.CreateReservRequest;
import com.LAB1.LAB1.MODEL.Response.ReservResponse;
import com.LAB1.LAB1.MODEL.Response.ReservResponseWithDate;

import java.time.LocalDateTime;

public interface ReservService {
    void saveReserv(CreateReservRequest reserv);
    void deleteReserv(Long id);
    ReservResponse getReserv(Long id);
    ReservResponseWithDate getReservWithDate(LocalDateTime date);
}
