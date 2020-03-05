package ru.cbr.tomsk.test.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Entity
@Table(name = "LASTNAME")
@Setter @Getter
@ToString()
@Slf4j
public class LastName extends AbstractEntity {

    @Column(name = "TEXT", length = 500, nullable = false)
    private String text;

    @ManyToOne
    @JoinColumn(name = "MAN_ID", nullable = false)
     private Man man;

}
