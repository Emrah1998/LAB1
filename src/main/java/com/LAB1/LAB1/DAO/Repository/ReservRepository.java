package com.LAB1.LAB1.DAO.Repository;

import com.LAB1.LAB1.DAO.Entity.ReservEntity;
import com.LAB1.LAB1.MODEL.Enum.ReservStatus;
import com.LAB1.LAB1.MODEL.Response.ReservResponseWithDate;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Optional;

public interface ReservRepository extends CrudRepository<ReservEntity,Long> {
     Optional<ReservResponseWithDate> findByStatusAndDateAfter(ReservStatus status, LocalDateTime date);


}
