package cz.snet.domain.model.invoice;

import cz.snet.domain.model.invoice.amount.Amount;
import cz.snet.domain.shared.Entity;

import java.math.BigDecimal;

// Entity
public class Invoice implements Entity<Invoice, InvoiceNumber> {
    private final InvoiceNumber invoiceNumber;
    private final BigDecimal total;

    @Override
    public InvoiceNumber id() {
        // TODO Auto-generated method stub
        return null;
    }

    protected Invoice(InvoiceNumber invoiceNumber) {
        super();
        this.invoiceNumber = invoiceNumber;
        this.total = BigDecimal.ZERO;
    }

    public Amount[] amounts() {
        return null;
    }

    public BigDecimal total() {
        return total;
    }

    @Override
    public int hashCode() {
        return invoiceNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Invoice other = (Invoice) obj;
        return invoiceNumber.equals(other.invoiceNumber);
    }
}
