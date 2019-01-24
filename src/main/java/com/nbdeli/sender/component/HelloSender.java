package com.nbdeli.sender.component;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @date 2018/9/17.
 */
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate template;

    public void send(){
//        User user=new User();
//        user.setUsername("li");
//        user.setPassword("123");
//        template.convertAndSend("queue",user);

//        template.convertAndSend("exchange","topic.message","hello word!");
        template.convertAndSend("fanoutExchange","","hello word!");
    }
}
