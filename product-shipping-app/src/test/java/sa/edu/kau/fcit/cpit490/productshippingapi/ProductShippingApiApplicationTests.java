package sa.edu.kau.fcit.cpit490.productshippingapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import sa.edu.kau.fcit.cpit490.productshippingapi.model.Shipping;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductShippingApiApplicationTests {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void shippingShouldReturnResponse() throws Exception {
		String js = this.restTemplate.getForObject("http://0.0.0.0:" + port + "/shipping" + "?id=123456", String.class);
		ObjectMapper mapper = new ObjectMapper();
		Shipping shipping = mapper.readValue(js, Shipping.class);
		assertThat(shipping.getId()).isEqualTo(123456);
		assertThat(shipping.getStatus()).containsAnyOf("shipped", "processing");
	}

}
