package com.example.capstone.dto;

import com.example.capstone.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {
    private Long id;
    private String title;//제목 받을 필드
    private String content;//내용을 받을 필드

    public Article toEntity(){//DTO를 엔티티로 변환하는 메소드
        return new Article(id, title, content);
    }
}
