package com.payment.demo.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Eventos {

    private Float horaExtra50;
    private Float horaExtra100;
    private Float faltas;
    private Float atraso;
    private Float adicionalNoturno;
    private Float diariaViagem;
    private Float auxilioCrecheBaba;
    
    public Eventos() {
        // Construtor vazio necessário para Lombok
    }

    
}
