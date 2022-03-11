package com.progile.resttemplate.dto;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Transactional
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    public Integer id;
    public Integer userId;
    public String title;
    public Boolean completed;

}
