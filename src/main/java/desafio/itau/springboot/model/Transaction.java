package desafio.itau.springboot.model;

import java.time.OffsetDateTime;

public class Transaction {

    private Double valor;
    private OffsetDateTime dataHora;


    public Transaction(final double valor, final OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }


    public Double getValor() {
        return valor;
    }


    public OffsetDateTime getDataHora() {
        return dataHora;
    }
    

    

    
}
