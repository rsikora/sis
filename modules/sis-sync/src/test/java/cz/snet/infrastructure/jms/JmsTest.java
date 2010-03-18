package cz.snet.infrastructure.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.ActiveMQQueueSession;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.log4j.Logger;
import org.junit.Test;

import javax.jms.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by IntelliJ IDEA.
 * User: sikorric
 * Date: Mar 18, 2010
 * Time: 2:55:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class JmsTest {
    private static final String TEXT = "Hello world!";
    public static final Logger log = Logger.getLogger(JmsTest.class);

    @Test
    public void testJmsQueue() throws Exception {
        // prepare queue
        QueueConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost?broker.persistent=false");
        QueueConnection connection = connectionFactory.createQueueConnection();
        QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
        Queue queue = session.createQueue("q");

        // create listener
        final boolean[] received = {false};
        MessageListener listener = new MessageListener() {

            @Override
            public void onMessage(Message message) {
                received[0] = true;
                log.debug(message);
            }
        };
        QueueReceiver receiver = session.createReceiver(queue);
        receiver.setMessageListener(listener);

        // send a message
        connection.start();
        QueueSender sender = session.createSender(queue);
        Message message = session.createTextMessage(TEXT);
        sender.send(message);

        // wait for delivery mechanism to trigger
        Thread.sleep(10);
        connection.close();

        assertThat(received[0], is(true));
    }

}
