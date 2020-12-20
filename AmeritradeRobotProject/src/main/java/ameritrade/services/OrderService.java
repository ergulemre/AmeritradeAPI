package ameritrade.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ameritrade.client.OrderClient;
import ameritrade.dto.AuthTokenResponseDTO;
import ameritrade.dto.GetOrdersResponseDTO;
import ameritrade.dto.InstrumentDTO;
import ameritrade.dto.OrderLegCollectionDTO;
import ameritrade.dto.PlaceOrderRequestDTO;

@Service
public class OrderService {
	
	@Autowired
	private OrderClient orderClient;
	
	@Autowired
	private TokenService tokenService;
	
	private int accountId = 1111111; // 
	
	public List<GetOrdersResponseDTO> getOrders() {
		
		AuthTokenResponseDTO getToken = tokenService.authorizationToken();
		String bearerToken = "Bearer " + getToken.getAccess_token();
		List<GetOrdersResponseDTO> getOrdersFromAT = orderClient.getOrders(bearerToken, accountId);
		
		return getOrdersFromAT;
	}
	
	public String placeOrder(String price, String instruction, String quantity, String symbol) {
		
		AuthTokenResponseDTO getToken = tokenService.authorizationToken();
		String bearerToken = "Bearer " + getToken.getAccess_token();

		int parseQuantity = Integer.parseInt(quantity);
		
		InstrumentDTO instrument = new InstrumentDTO();
		instrument.setAssetType("EQUITY");
		instrument.setSymbol(symbol);
		
		OrderLegCollectionDTO orderLegCollection = new OrderLegCollectionDTO();
		orderLegCollection.setInstruction(instruction);
		orderLegCollection.setQuantity(parseQuantity);
		orderLegCollection.setInstrument(instrument);
		
		List<OrderLegCollectionDTO> orderLegArray = new ArrayList();
		orderLegArray.add(orderLegCollection);
		
		PlaceOrderRequestDTO placeOrderRequest = new PlaceOrderRequestDTO();
		placeOrderRequest.setComplexOrderStrategyType("NONE");
		placeOrderRequest.setOrderType("LIMIT");
		placeOrderRequest.setSession("NORMAL");
		placeOrderRequest.setPrice(price);
		placeOrderRequest.setDuration("DAY");
		placeOrderRequest.setOrderStrategyType("SINGLE");
		placeOrderRequest.setOrderLegCollection(orderLegArray);
		
		String responsePlaceOrder = orderClient.placeOrder(bearerToken, placeOrderRequest);		
		
		return responsePlaceOrder;
	}

}
