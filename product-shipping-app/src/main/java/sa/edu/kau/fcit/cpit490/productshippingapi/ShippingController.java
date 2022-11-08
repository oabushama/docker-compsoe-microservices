package sa.edu.kau.fcit.cpit490.productshippingapi;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sa.edu.kau.fcit.cpit490.productshippingapi.model.Shipping;

import java.util.Random;

@RestController
public class ShippingController {

  private final String[] status = new String[]{"shipped", "processing"};
  private final String[] items = new String[]{
          "convertible sofa", "dining table",
          "floor lamp", "coffee table", "desk",
          "Ottoman", "barrel chair", "corner bookcase"};

  // The MappingJackson2HttpMessageConverter should handle the conversion of the Shipping object to JSON under the hood.
  // This is possible because the Jackson 2 dependency is present in the classpath.
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  @RequestMapping(path="/shipping", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Shipping> shipping(@RequestParam(value = "id") long orderId) {
    String orderStatus = status[new Random().nextInt(status.length)];
    String item = items[new Random().nextInt(items.length)];
    return ResponseEntity.ok(new Shipping(orderId, item, orderStatus));
  }
}
