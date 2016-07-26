/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gumga.aprendendospring.AprendendoSpring.domain.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;

/**
 *
 * @author munif
 */
@Entity
@Table(name = "tarefas")
public class Tarefa {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String descricao;
    private boolean finalizado;
    
    @Column(name = "data_finalizado", nullable = true)
    @Temporal(TemporalType.DATE)
    private Calendar dataFinalizado;
    
}
