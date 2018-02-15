package com.java.consumer.jms;
/*package com.java.security.jms;

import java.util.Map;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.apache.activemq.command.Message;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

@Component
public class JmsListener {

	@org.springframework.jms.annotation.JmsListener(destination="inbound.queue")
	@SendTo("outbound.queue")
	public String receiveMessage(final Message jsonMessage) throws JMSException{
		String messageData = null;
		System.out.println("received message "+jsonMessage);
		String response = null;
		TextMessage textMessage = null;
		if(jsonMessage instanceof TextMessage) {
			textMessage = (TextMessage)jsonMessage;
			messageData = textMessage.getText();
			@SuppressWarnings("rawtypes")
			Map map = new Gson().fromJson(messageData, Map.class);
			response  = "Hello " + map.get("name");
		}
		return "Acknowledging message";
	}
}
*/