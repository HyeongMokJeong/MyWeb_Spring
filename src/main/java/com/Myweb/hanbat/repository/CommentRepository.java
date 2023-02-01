package com.Myweb.hanbat.repository;

import com.Myweb.hanbat.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
