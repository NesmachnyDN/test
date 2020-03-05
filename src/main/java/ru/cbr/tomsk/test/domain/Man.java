package ru.cbr.tomsk.test.domain;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MEN")
@Setter @Getter
@ToString()
@Slf4j
public class Man extends AbstractEntity {

    @Column(name = "FIRST_NAME", length = 500, nullable = false)
    private String firstName;

    @OneToMany(mappedBy="man", cascade = CascadeType.ALL)
    private List<LastName> lastNameList;
}


