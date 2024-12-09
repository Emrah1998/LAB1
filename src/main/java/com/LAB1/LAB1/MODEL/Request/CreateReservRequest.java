package com.LAB1.LAB1.MODEL.Request;

import com.LAB1.LAB1.MODEL.Enum.ReservStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateReservRequest {
    private String table_name;
    private String customer;
    private LocalDateTime date;
    private Integer members_count;
    private ReservStatus status;
}
