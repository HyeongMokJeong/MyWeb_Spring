package com.Myweb.hanbat.dto;

import com.Myweb.hanbat.entity.Comment;
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

    public static CommentDto createCommentDto(Comment comment) {
        return new CommentDto(
                comment.getId(),
                comment.getNick(),
                comment.getPassword(),
                comment.getComment(),
                comment.getLink(),
                comment.getDate()
        );
    }
}
