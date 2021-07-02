package pl.storage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.storage.config.AppConfig;
import pl.storage.model.ProductEntity;
import pl.storage.model.ProductGroup;
import pl.storage.repository.ProductRepository;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        ProductRepository repository = context.getBean(ProductRepository.class);

        ProductEntity.ProductEntityBuilder procuctX = ProductEntity.builder().productName("XXX").groupProduct(ProductGroup.WE_POZ);
    }
}
