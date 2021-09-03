package giveMeCards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;
import com.google.gson.Gson;


@SpringBootApplication
@RestController
public class Application {

   // int upperbound = 14;
//
   // private Random rand;
   // int cardNoOne = rand.nextInt(upperbound);
   // int cardNoTwo = rand.nextInt(upperbound);



    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    @GetMapping("/getSomeCards")
    public String yourCards(@RequestParam(value = "cardsPls", defaultValue = "Yes") String cardPair) {
        return CardImageGenerator.generateCardVisual("Hearts",9)+ CardImageGenerator.generateCardVisual("Hearts",2);
    }

}