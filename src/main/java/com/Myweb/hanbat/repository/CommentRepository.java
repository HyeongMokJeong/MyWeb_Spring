package com.Myweb.hanbat.repository;

import com.Myweb.hanbat.dto.CommentDto;
import com.Myweb.hanbat.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Override
    Comment findById();
}
