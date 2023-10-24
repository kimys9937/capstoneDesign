package com.example.capstone.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Getter
public class Article {
    @Id//엔티티 대푯값 지정(데이블을 생성하면 프라이빗으로 쓰겠다.)
    @GeneratedValue//자동 생성 추가 기능
    public Long id;

    @Column
    public String title;
    @Column
    public String content;
}
