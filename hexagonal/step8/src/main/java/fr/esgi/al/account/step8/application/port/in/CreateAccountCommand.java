package fr.esgi.al.account.step8.application.port.in;

import fr.esgi.al.account.step8.domain.Money;

import java.util.Objects;

public class CreateAccountCommand {

    public final Money initialMoney;

    public CreateAccountCommand(Money initialMoney) {
        this.initialMoney = Objects.requireNonNull(initialMoney);
    }
}
