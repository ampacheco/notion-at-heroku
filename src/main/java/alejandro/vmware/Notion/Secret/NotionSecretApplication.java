package alejandro.vmware.Notion.Secret;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class NotionSecretApplication {
	public static void main(String[] args) {
		SpringApplication.run(NotionSecretApplication.class, args);
	}

}
