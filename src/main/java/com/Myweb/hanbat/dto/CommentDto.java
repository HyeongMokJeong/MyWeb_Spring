package com.Myweb.hanbat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommentDto {
    private Long id;
    private String nick;
    private String password;
    private String comment;
    private String link;
    private LocalDateTime data;
}
