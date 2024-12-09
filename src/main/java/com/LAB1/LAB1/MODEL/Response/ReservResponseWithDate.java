package com.LAB1.LAB1.MODEL.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservResponseWithDate {
    private Long id;
    private String table_name;
    private String customer;
}
