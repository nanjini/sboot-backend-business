import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sboot.backend.business.**")
public class HelloBusiness {
    private static final Logger logger = LogManager.getLogger(HelloBusiness.class);
    public static void main(String[] args) {
        SpringApplication.run(HelloBusiness.class, args);
        logger.info("main started!");
    }
}