package ameritrade.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import ameritrade.dto.GetOrdersResponseDTO;
import ameritrade.dto.PlaceOrderRequestDTO;

@FeignClient(value = "orderClient", url = "https://api.tdameritrade.com")
public interface OrderClient {
	
	@GetMapping(value="/v1/orders")
	public List<GetOrdersResponseDTO> getOrders(@RequestHeader("Authorization") String bearerToken, @RequestHeader("accountId") int accountId );
	
	@PostMapping(value="v1/accounts/YOUR_ACCOUNT_ID/orders", consumes = "application/json")
	public String placeOrder(@RequestHeader("Authorization") String bearerToken, @RequestBody PlaceOrderRequestDTO placeOrderRequest );
	
}