package com.LAB1.LAB1.DAO.Entity;

import com.LAB1.LAB1.MODEL.Enum.ReservStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "reservations")
public class ReservEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String table_name;
    private String customer;
    private LocalDateTime date;
    private Integer members_count;
    @Enumerated(EnumType.STRING)
    private ReservStatus status;

}
