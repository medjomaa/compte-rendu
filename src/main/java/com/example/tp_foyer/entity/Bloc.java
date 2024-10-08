package com.example.tp_foyer.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBloc;
    private String nomBloc;
    private int capaciteBloc;
}
