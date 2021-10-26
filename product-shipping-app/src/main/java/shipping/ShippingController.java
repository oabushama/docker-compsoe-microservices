package shipping;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    private static final String template = "Shipping %s";
    private final AtomicLong counter = new AtomicLong();
    private final String[] status = new String[]{"shipped", "processing"};
    private final String[] items = new String[]{
            "convertible sofa", "dining table",
            "floor lamp", "coffee table", "desk",
            "Ottoman", "barrel chair", "corner bookcase"};

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping("/shipping")
    public Shipping shipping(@RequestParam(value = "id") long orderId) {
        String orderStatus = status[new Random().nextInt(status.length)];
        String item = items[new Random().nextInt(items.length)];
        return new Shipping(orderId, item, orderStatus);
    }
}
