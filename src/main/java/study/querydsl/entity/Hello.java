package study.querydsl.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author jeonghwanlee
 * @date 2023-11-20
 */
@Entity
@Getter @Setter
public class Hello {

    @Id @GeneratedValue
    private Long id;
}
