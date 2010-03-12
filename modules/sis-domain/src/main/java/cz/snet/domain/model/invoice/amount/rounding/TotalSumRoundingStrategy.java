package cz.snet.domain.model.invoice.amount.rounding;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by IntelliJ IDEA.
 * User: sikorric
 * Date: Mar 12, 2010
 * Time: 4:44:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class TotalSumRoundingStrategy implements RoundingStrategy {
    @Override
    public BigDecimal round(BigDecimal value) {
        BigDecimal rounded = value.setScale(0, RoundingMode.HALF_UP);
        return rounded.subtract(value);
    }
}
