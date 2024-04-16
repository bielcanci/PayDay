package com.payment.demo.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonDeserialize
public class Eventos {

    private Float horaExtra50;
    private Float horaExtra100;
    private Float faltas;
    private Float atraso;
    private Float descansoSemanalRemunerado;
    private Float adicionalNoturno;
    private Float salarioFamilia; // Ajuste: Remova 'sSalarioFamilia' e 'sAuxilioCrecheBaba'
    private Float diariaViagem;
    private Float auxilioCrecheBaba;
    
    public Eventos() {
        // Construtor vazio necessário para Lombok
    }

    
}
