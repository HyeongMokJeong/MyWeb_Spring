package com.Myweb.hanbat.entity;

import com.Myweb.hanbat.dto.CommentDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nick;

    @Column
    private String password;

    @Column
    private String comment;

    @Column
    private String link;

    @Column
    private LocalDateTime date;

}
