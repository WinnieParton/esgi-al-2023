package fr.esgi.al.account.step10.domain;

public record AccountConfiguration(long transferThreshold) {

    public long getTransferThreshold() {
        return transferThreshold;
    }
}
