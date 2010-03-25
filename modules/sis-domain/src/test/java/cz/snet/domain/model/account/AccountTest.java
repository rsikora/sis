package cz.snet.domain.model.account;

import cz.snet.domain.model.invoice.charge.ChargeFactory;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class AccountTest {
    public void testAggregate() throws Exception {
        Account account = new Account();
        Subscription[] subscriptions = account.subscriptions();
        for (Subscription subscription : subscriptions) {
            ChargeFactory[] chargeFactories = subscription.chargeFactories();
            for (ChargeFactory chargeFactory : chargeFactories) {
                assertThat(chargeFactory, is(not(nullValue())));
                // here we have chargeFactory to invoice
            }
        }
    }
}
