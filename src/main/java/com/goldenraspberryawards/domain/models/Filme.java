package com.goldenraspberryawards.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "movie")
@NoArgsConstructor
@Data
public class Filme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mov_id", updatable = false)
    private Long id;

    @NotNull
    @Column(name = "mov_year", nullable = false)
    private Long year;

    @NotEmpty
    @Size(max = 255)
    @Column(name = "mov_title", nullable = false)
    private String title;

    @NotEmpty
    @Size(max = 255)
    @Column(name = "mov_studio", nullable = false)
    private String studio;

    @NotEmpty
    @Size(max = 255)
    @Column(name = "mov_producer", nullable = false)
    private String producer;

    @NotNull
    @Column(name = "mov_winner", nullable = false)
    private Boolean winner;

}
