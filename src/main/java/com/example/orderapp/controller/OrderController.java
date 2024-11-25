
import com.example.orderapp.entity.Order;
import com.example.orderapp.entity.User;
import com.example.orderapp.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



@RestController
@RequestMapping("/api")


public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return orderService.saveUser(user);
    }

    @PostMapping("/orders")
    public Order addOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @GetMapping("/orders")
    public List<Map<String, Object>> listOrders() {
        //return orderService.getOrders().stream().map(order -> {
            //Map<String, Object> response = new HashMap<>();
            //response.put("user", order.getUser().getName());
            //response.put("total", order.getTotalPrice());
            //return response;
        //}).collect(Collectors.toList());
        return List.of();
    }
}
