package Bankomat;

import java.math.BigDecimal;

public class Atm {
    private Card card;

    public Atm(Card card) {
        this.card = card;
    }

    public void add(BigDecimal money) {
        card.addBalance(money);
    }

    public void subtractBalance(BigDecimal money) {
        try {
            card.subtractBalance(money);
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
