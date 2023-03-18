package com.example.kafka;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.IntegerSerializer;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;

public class ProducerUsingJavaWithAutoPassingArgument {
    
    public static void main(String[] args) {

        //Step 1 - Set the properties
        Properties props = new Properties();
        // Passing app id / name from ConstantConfigurations java File
        props.put(ProducerConfig.CLIENT_ID_CONFIG, ConstantConfigurations.appID);
        // Passing bootstrap server from ConstantConfigurations java File
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, ConstantConfigurations.bootStrapServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, IntegerSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        //Step 2 - Set object of the kafka Producer
        KafkaProducer<Integer, String> producer = new KafkaProducer<>(props);

        //Step 3 - Calling the send method on this Producer object
//        for(int i =1; i<=50; i++){

            // Passing Topic name from ConstantConfigurations java File
            producer.send(new ProducerRecord<Integer, String>(ConstantConfigurations.topicName, 1, "2013-07-2500:00:00.0,11599,CLOSED"));
//         s   producer.send(new ProducerRecord<Integer, String>(ConstantConfigurations.topicName, 2, "2013-07-2500:00:00.0,12111,COMPLETE"));


//        }

        //Step 4 - Close the Producer object
        producer.close();
    }
}
