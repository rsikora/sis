package cz.snet.domain.model.invoice;

public class InvoiceNumberFactory {
    private InvoiceNumber current;

    public InvoiceNumberFactory(InvoiceNumber current) {
        super();
        this.current = current;
    }

    public InvoiceNumber nextNumber() {
        current = current.nextNumber();
        return current;
    }
}
