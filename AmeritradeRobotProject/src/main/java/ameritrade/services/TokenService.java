package ameritrade.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ameritrade.client.AuthTokenClient;
import ameritrade.dto.AuthTokenResponseDTO;

@Service
public class TokenService {

	@Autowired
	private AuthTokenClient tokenClient;
	
	private String refreshToken = "your_refresh_token";
	private String grantType = "refresh_token";
	private String clientId = "your_client_id";
	
	public AuthTokenResponseDTO authorizationToken() {
		
		Map<String, String> tokenRequest = new HashMap<String, String>();
		tokenRequest.put("client_id", clientId);
		tokenRequest.put("grant_type", grantType);
		tokenRequest.put("refresh_token", refreshToken);
		
		AuthTokenResponseDTO token = tokenClient.getOrders(tokenRequest);
		
		return token;
	}
}
