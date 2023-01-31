package com.Myweb.hanbat.service;

import com.Myweb.hanbat.dto.CommentDto;
import com.Myweb.hanbat.entity.Comment;
import com.Myweb.hanbat.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    public CommentDto getComment(Long id) {
        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("댓글 조회 실패 - 대상 댓글이 없습니다."));

        return null;
    }
}
