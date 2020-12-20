package ameritrade.client;


import java.util.Map;

import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ameritrade.dto.AuthTokenResponseDTO;
import feign.Headers;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;

@FeignClient(value = "tokenClient", url = "https://api.tdameritrade.com", configuration = AuthTokenClient.Configuration.class)
public interface AuthTokenClient {

	@RequestMapping(value = "v1/oauth2/token", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED)
    @Headers("Content-Type: application/x-www-form-urlencoded")
	public AuthTokenResponseDTO getOrders(@RequestBody Map<String, ?> formParams);
	
	class Configuration {
        @Bean
        Encoder feignFormEncoder(ObjectFactory<HttpMessageConverters> converters) {
            return new SpringFormEncoder(new SpringEncoder(converters));
        }
    }
}
