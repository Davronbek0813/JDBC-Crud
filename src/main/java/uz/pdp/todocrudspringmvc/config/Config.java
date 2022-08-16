package uz.pdp.todocrudspringmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import uz.pdp.todocrudspringmvc.formatter.DateFormatter;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@EnableWebMvc
@ComponentScan("uz.pdp")
public class Config implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){
       InternalResourceViewResolver resolver=new InternalResourceViewResolver();
       resolver.setViewClass(JstlView.class);
       resolver.setPrefix("/WEB-INF/jsp/");
       resolver.setSuffix(".jsp");
       return resolver;

    }
    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/mvc");
        dataSource.setUsername("postgres");
        dataSource.setPassword("root123");
        return dataSource;
    }
    @Bean

    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new DateFormatter());
    }
}
