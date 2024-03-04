package Bank;

public enum AccountType {
    CORRENTE, POUPANCA;

    @Override
    public String toString() {
        return switch (this) {
            case CORRENTE -> "corrente";
            case POUPANCA -> "Poupança";
        };
    }
}
