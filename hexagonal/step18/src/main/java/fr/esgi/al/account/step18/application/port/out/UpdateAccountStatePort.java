package fr.esgi.al.account.step18.application.port.out;

import fr.esgi.al.account.step18.domain.Account;

public interface UpdateAccountStatePort {
    void update(Account account);
}
