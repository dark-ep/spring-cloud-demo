package cn.ep.spring.boot.ch06.s04;

import org.springframework.cloud.stream.annotation.*;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.kafka.support.*;
import org.springframework.messaging.Message;

@EnableBinding(Sink.class)
public class MsgSink {

    @StreamListener(Sink.INPUT)
    public void process(Message<String> message) {
        System.out.println(message.getPayload());
        Acknowledgment acknowledgment = message.getHeaders().get(KafkaHeaders.ACKNOWLEDGMENT, Acknowledgment.class);
        if (acknowledgment != null) {
            System.out.println("Acknowledgment provided");
            acknowledgment.acknowledge();
        }
    }

}
