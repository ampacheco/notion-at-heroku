package alejandro.vmware.Notion.Secret;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;



@RestController
@RequestMapping("/notion")
public class NotionController {

    private final NotionConfigProperties properties;

    public NotionController(NotionConfigProperties properties) {
        this.properties = properties;
    }

    @GetMapping
    public Map<String, String> printAllProps() {
        return Map.of(
                "apiUrl", properties.apiUrl(),
                "apiVersion", properties.apiVersion(),
                "authToken", properties.authToken(),
                "databaseId", properties.databaseId());
    }
}
