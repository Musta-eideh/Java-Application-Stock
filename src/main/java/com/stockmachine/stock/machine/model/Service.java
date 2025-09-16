package com.stockmachine.stock.machine.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "services")
public class Service {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String nameClient;

    @Column(nullable = false)
    private String machineModel;

    @Column(nullable = false)
    private String partUsed;

    @Column(nullable = false)
    private String amount;

    @Column(nullable = false)
    private String valueOfThePiece;

    @Column(nullable = false)
    private String labor;

    @Column(nullable = false)
    private String totalService;
}
