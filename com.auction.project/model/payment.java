package com.auction.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long itemId;
    private double amount;
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String securityCode;
    private boolean expeditedShipping;
}
