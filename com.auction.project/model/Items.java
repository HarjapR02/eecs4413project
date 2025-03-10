package com.auction.project;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "auction_items")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double currentBid;
    private String auctionType; // "Forward" or "Dutch"
    private String keyword;
    private long remainingTime;
}
