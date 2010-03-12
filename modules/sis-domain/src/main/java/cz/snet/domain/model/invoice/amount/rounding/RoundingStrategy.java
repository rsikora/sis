package cz.snet.domain.model.invoice.amount.rounding;

import java.math.BigDecimal;

/**
 * User: der3k
 * Date: Mar 10, 2010
 * Time: 1:31:40 AM
 */
public interface RoundingStrategy {
    BigDecimal round(BigDecimal value);
}
