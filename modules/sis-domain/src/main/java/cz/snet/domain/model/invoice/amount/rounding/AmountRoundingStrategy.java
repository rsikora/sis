package cz.snet.domain.model.invoice.amount.rounding;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by IntelliJ IDEA.
 * User: sikorric
 * Date: Mar 12, 2010
 * Time: 4:35:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmountRoundingStrategy implements RoundingStrategy {

    @Override
    public BigDecimal round(BigDecimal value) {
        return value.setScale(2, RoundingMode.HALF_UP);
    }
}
