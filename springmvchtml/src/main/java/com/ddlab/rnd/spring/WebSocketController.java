package com.ddlab.rnd.spring;

import java.security.Principal;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class WebSocketController {
	
	@MessageMapping("/simplemessages")
    @SendTo("/topic/simplemessagesresponse")
    public MessageBroadcast processMessageFromClient(SimpleMessage message,
            Principal principal) throws Exception {
        // Simulate a delay of 3 seconds
        Thread.sleep(3000);
        return new MessageBroadcast("Server response: Did you send &lt;b&gt;'"
                + message.getMessage() + "'&lt;/b&gt;? (Server Response at: "
                + ")");
    }
	
	
	@MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
		System.out.println("coming here....................");
        Thread.sleep(3000); // simulated delay
        return new Greeting("Hello, " + message.getName() + "!");
    }

}
