package dev.quantferox.voltex;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController("helloController")
@RequestMapping("/api")
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello, Voltex!";
  }

  @PostMapping("/hello")
  public String hello(@RequestParam String name) {
    return "Hello, %s!".formatted(name);
  }
}
