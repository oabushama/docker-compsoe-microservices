package sa.edu.kau.fcit.cpit490.productsearchapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import static org.assertj.core.api.Assertions.assertThat;
import sa.edu.kau.fcit.cpit490.productsearchapi.model.Product;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ProductSearchApiApplicationTests {

	@LocalServerPort
	private int port;
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void searchShouldReturnResponse() throws Exception {
		String js = this.restTemplate.getForObject("http://0.0.0.0:" + port + "/product" + "?name=sofa", String.class);
		ObjectMapper mapper = new ObjectMapper();
		Product product = mapper.readValue(js, Product.class);
		assertThat(product.getName()).isEqualTo("sofa");
		assertThat(product.getPrice()).isGreaterThan(120.00).isLessThan(499.00);
	}

}
