package cz.snet.domain.model.invoice;

import cz.snet.domain.shared.ValueObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvoiceNumber implements ValueObject<InvoiceNumber> {
    private final static Pattern INVOICE_NUMBER_PATTERN = Pattern.compile("(\\D*?)(\\d+)");
    private final String prefix;
    private final long value;
    private final int length;

    public InvoiceNumber(final String invoiceNumber) {
        Matcher matcher = INVOICE_NUMBER_PATTERN.matcher(invoiceNumber);
        if (!matcher.matches())
            throw new IllegalArgumentException("Illegal invoice number :" + invoiceNumber);
        prefix = matcher.group(1);
        String number = matcher.group(2);
        this.value = Long.valueOf(number);
        this.length = number.length();
    }

    @Override
    public String toString() {
        return toStringInternal(value);
    }

    public InvoiceNumber nextNumber() {
        return new InvoiceNumber(toStringInternal(value + 1));
    }

    private String toStringInternal(long value) {
        return prefix + String.format("%0" + length + "d", value);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + length;
        result = prime * result + ((prefix == null) ? 0 : prefix.hashCode());
        result = prime * result + (int) (value ^ (value >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        InvoiceNumber other = (InvoiceNumber) obj;
        if (length != other.length)
            return false;
        if (prefix == null) {
            if (other.prefix != null)
                return false;
        } else if (!prefix.equals(other.prefix))
            return false;
        if (value != other.value)
            return false;
        return true;
    }
}
