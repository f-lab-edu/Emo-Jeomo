package flab.emojeomo.store.mall.domain;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Mall {

    @Id
    @GeneratedValue
    private Long idx;

    private String name;

    @Enumerated(EnumType.STRING)
    private MallType type;

    @Enumerated(EnumType.STRING)
    private MallStatus status;

    private Date createdDate;

    private String detail;

    public Mall(String name, MallType type, MallStatus status, String detail) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.detail = detail;
    }
}
