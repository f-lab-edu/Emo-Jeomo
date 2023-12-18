package flab.emojeomo.store.wish.domain;

import jakarta.persistence.*;

@Entity
public class Wish {
    @Id
    @GeneratedValue
    private Long idx;

    private Long memberIdx;
    private Long mallIdx;
    private Long productIdx;

    @Enumerated(EnumType.STRING)
    private WishType type;

}
