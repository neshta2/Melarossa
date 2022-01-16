package Bankomat;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Card card = new DebitCard("Lida", new BigDecimal("45644"));
        Card card2 = new CreditCard("Lida", new BigDecimal("45644"));
        Card card3 = new CreditCard("Dima");
        Atm atm = new Atm(card3);
        System.out.println(card3);
        atm.subtractBalance(new BigDecimal("45644888"));
        System.out.println(card3);
    }
}