package cz.snet.domain.model.account;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class AccountTest {
    public void testAggregate() throws Exception {
        Account account = new Account();
        Subscription[] subscriptions = account.subscriptions();
        for (Subscription subscription : subscriptions) {
            Charge[] charges = subscription.charges();
            for (Charge charge : charges) {
                assertThat(charge, is(not(nullValue())));
                // here we have charge to invoice
            }
        }
    }
}