package com.Myweb.hanbat.apicontroller;

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

    @GetMapping("/comment/{id}")
    public ResponseEntity<CommentDto> getComment(@PathVariable Long id) {
        CommentDto comment = commentService.getComment(id);

        return ResponseEntity.status(HttpStatus.OK).body(comment);
    }
}
