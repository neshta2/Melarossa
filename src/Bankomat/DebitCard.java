package Bankomat;
import java.math.BigDecimal;

public class DebitCard extends Card{

    public DebitCard(String name) {
        super(name);
    }

    public DebitCard(String name, BigDecimal balance) {
        super(name, balance);
    }

    @Override
    public void subtractBalance(BigDecimal money) throws InsufficientFundsException {
        if (balance.compareTo(money) >= 0) {
            balance = balance.subtract(money);
        } else {
            throw new InsufficientFundsException("Нe достаточно средств");
        }
    }
}