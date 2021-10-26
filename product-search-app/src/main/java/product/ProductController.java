package product;

import java.text.DecimalFormat;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
  @RequestMapping("/product")
  public Product product(@RequestParam(value = "name", defaultValue = "sofa", required = false) String name) {

    return new Product(counter.incrementAndGet(), name, generateRandomPrice());
  }
}
