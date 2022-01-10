package Bankomat;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Card card = new DebitCard("Lida", new BigDecimal("45644"));
        Card card2 = new CreditCard("Lida", new BigDecimal("45644"));

        Atm atm = new Atm(card2);

        atm.subtractBalance(new BigDecimal("45644888"));




    }
}