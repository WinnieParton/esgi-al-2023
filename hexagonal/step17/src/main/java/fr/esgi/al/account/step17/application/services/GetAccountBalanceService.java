package fr.esgi.al.account.step17.application.services;

import fr.esgi.al.account.step17.application.port.in.AccountBalanceQuery;
import fr.esgi.al.account.step17.application.port.out.LoadAccountPort;
import fr.esgi.al.account.step17.domain.AccountId;
import fr.esgi.al.kernel.QueryHandler;

import java.util.UUID;

public final class GetAccountBalanceService implements QueryHandler<AccountBalanceQuery, Double> {

    private final LoadAccountPort loadAccountPort;

    public GetAccountBalanceService(LoadAccountPort loadAccountPort) {
        this.loadAccountPort = loadAccountPort;
    }

    @Override
    public Double handle(AccountBalanceQuery query) {
        var account = loadAccountPort.load(AccountId.of(UUID.fromString(query.accountId)));
        return account.balance().value();
    }
}
