package com.LAB1.LAB1.SERVICE;

import com.LAB1.LAB1.DAO.Entity.ReservEntity;
import com.LAB1.LAB1.DAO.Repository.ReservRepository;
import com.LAB1.LAB1.MODEL.Enum.ReservStatus;
import com.LAB1.LAB1.MODEL.Request.CreateReservRequest;
import com.LAB1.LAB1.MODEL.Response.ReservResponse;
import com.LAB1.LAB1.MODEL.Response.ReservResponseWithDate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ReservServiceHandle implements ReservService {

    private final ReservRepository reservRepository;


    @Override
    public void saveReserv(CreateReservRequest reserv) {
        reservRepository.save(
                ReservEntity.builder()
                        .table_name(reserv.getTable_name())
                        .customer(reserv.getCustomer())
                        .date(LocalDateTime.now())
                        .status(ReservStatus.ACTIVE)
                        .members_count(reserv.getMembers_count())
                        .build()
        );
    }

    @Override
    public void deleteReserv(Long id) {
        var reserv = fetchReservIfexist(id);
        reserv.setStatus(ReservStatus.INACTIVE);
        reservRepository.save(reserv);
    }

    @Override
    public ReservResponse getReserv(Long id) {

        var reserv = fetchReservIfexist(id);

        return new ReservResponse(reserv.getTable_name(), reserv.getCustomer(),
                reserv.getDate(), reserv.getStatus());

    }

    private ReservEntity fetchReservIfexist(Long id) {
        return reservRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }


    @Override
    public ReservResponseWithDate getReservWithDate(LocalDateTime date) {
      var reserv =  reservRepository.findByStatusAndDateAfter(ReservStatus.ACTIVE, date)
                .orElseThrow(RuntimeException::new);
      return reserv;
    }
}
