package hello;

import javax.jms.Message;

import org.springframework.jms.support.converter.MappingJackson2MessageConverter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class EmailMappingJackson2MessageConverter extends MappingJackson2MessageConverter {
  
  @Override
  public JavaType getJavaTypeForMessage(Message message) {
    return TypeFactory.defaultInstance().constructType(Email.class);
  }

}
