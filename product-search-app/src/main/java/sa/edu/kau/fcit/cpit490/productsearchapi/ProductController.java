package sa.edu.kau.fcit.cpit490.productsearchapi;

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

  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @RequestMapping(method= RequestMethod.GET, path="/product")
  public Product product(@RequestParam(value = "name", defaultValue = "sofa", required = false) String name) {
    return new Product(counter.incrementAndGet(), name, generateRandomPrice());
  }
}
