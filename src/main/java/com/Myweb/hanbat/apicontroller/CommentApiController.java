package com.Myweb.hanbat.apicontroller;

import com.Myweb.hanbat.annotation.RunningTime;
import com.Myweb.hanbat.dto.CommentDto;
import com.Myweb.hanbat.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentApiController {

    @Autowired
    CommentService commentService;

    @GetMapping("/api/comments/{id}")
    public ResponseEntity<CommentDto> getComment(@PathVariable Long id) {
        CommentDto comment = commentService.getCommentById(id);

        return (comment != null) ?
                ResponseEntity.status(HttpStatus.OK).body(comment) :
                ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
