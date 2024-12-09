package com.LAB1.LAB1.MODEL.Response;

import com.LAB1.LAB1.MODEL.Enum.ReservStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservResponse {
    private String table_name;
    private String customer;
    private LocalDateTime date;
    private ReservStatus status;
}
