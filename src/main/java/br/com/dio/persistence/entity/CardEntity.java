package br.com.dio.persistence.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();
    private LocalDateTime datePlaced;  // Campo para armazenar a data de colocação
    private LocalDateTime dateMoved;   // Campo para armazenar a data de movimentação
    private LocalDateTime blockDate;   // Campo para armazenar a data de bloqueio
    private String blockReason;        // Campo para armazenar o motivo do bloqueio

}
