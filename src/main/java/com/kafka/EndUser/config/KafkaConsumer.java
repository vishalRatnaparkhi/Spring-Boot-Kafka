
package com.kafka.EndUser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumer {

    @KafkaListener(topics = AppConstants.LCOATION_UPDATE_TOPIC,groupId = AppConstants.GROUP_ID)
 public void updatedLocation( String Location)
 {
     System.out.println(Location);
 }
}
