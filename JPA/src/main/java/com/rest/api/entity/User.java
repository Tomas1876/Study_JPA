package com.rest.api.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//entity란 db table 간의 구조와 관계를 JPA가 요구하는 형태로 만든 Model

@Builder // builder를 사용할수 있게 한다
@Entity // jpa entity임을 알힌다
@Getter // user 필드값의 getter를 자동으로 생성
@NoArgsConstructor // 인자없는 생성자를 자동으로 생성
@AllArgsConstructor // 인자를 모두 갖춘 생성자를 자동으로 생성합
@Table(name = "user") // 'user' 테이블과 매핑됨을 명시
public class User {
    @Id // primaryKey임을 알림
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  pk생성전략을 DB에 위임한다는 의미. mysql로 보면 pk 필드를 auto_increment로 설정해 놓은 경우
    private long msrl;
    @Column(nullable = false, unique = true, length = 30) // uid column을 명시. 필수이고 유니크한 필드이며 길이는 30
    private String uid;
    @Column(nullable = false, length = 100) // name column을 명시. 필수이고 길이는 100
    private String name;
}