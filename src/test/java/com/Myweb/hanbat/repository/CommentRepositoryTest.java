package com.Myweb.hanbat.repository;

import com.Myweb.hanbat.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CommentRepositoryTest {

    @Autowired
    CommentRepository commentRepository;

    @Test
    @DisplayName("Id로 댓글 조회")
    void findByCommentId() {
        // test1 : id 1의 테스트 댓글
        {
            // 실제
            Comment target = commentRepository.findById(1L)
                    .orElseThrow(() -> new IllegalArgumentException("댓글 조회 실패"));

            // 예상
            Comment expected = new Comment(1L,
                    "test",
                    "1234",
                    "api test comment",
                    "server",
                    LocalDateTime.parse("2022-08-12T17:05:54")
                    );

            // 비교
            assertEquals(target.toString(), expected.toString(), "id 1의 테스트 댓글 출력");
        }
    }
}