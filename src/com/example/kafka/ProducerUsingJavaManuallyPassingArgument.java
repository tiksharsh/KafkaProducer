package com.example.kafka;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;

public class ProducerUsingJavaManuallyPassingArgument {
    public static void main(String[] args) {



        //Step 1 - Set the properties
        Properties props = new Properties();
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "producer-id1");
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092, localhost:9093");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //Step 2 - Set object of the kafka Producer
        KafkaProducer<Integer, String> producer = new KafkaProducer<>(props);

        //Step 3 - Calling the send method on this Producer object
        for(int i=0; i <= ConstantConfigurations.serverData.length - 1; i++){

            producer.send(new ProducerRecord<Integer, String>("new_topic9", i+102, ConstantConfigurations.serverData[i]));

        }

        //Step 4 - Close the Producer object
        producer.close();
    }

}
