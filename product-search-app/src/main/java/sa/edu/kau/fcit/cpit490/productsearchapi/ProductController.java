package sa.edu.kau.fcit.cpit490.productsearchapi;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;
import sa.edu.kau.fcit.cpit490.productsearchapi.model.Product;

import java.util.Random;

@RestController
public class ProductController {

  private final AtomicLong counter = new AtomicLong();

  private double generateRandomPrice() {
    double min = 120.00;
    double max = 499.00;
    double random = new Random().nextDouble();
    double price = min + (random * (max - min));
    DecimalFormat df = new DecimalFormat("#.00");
    return Double.parseDouble(df.format(price));
  }

   // The MappingJackson2HttpMessageConverter should handle the conversion of the Product object to JSON under the hood.
  // This is possible because the Jackson 2 dependency is present in the classpath.
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @RequestMapping(path="/product", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Product> product(@RequestParam(value = "name", defaultValue = "sofa", required = false) String name) {
    return ResponseEntity.ok(new Product(counter.incrementAndGet(), name, generateRandomPrice()));
  }
}
