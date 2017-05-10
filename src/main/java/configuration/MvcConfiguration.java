package configuration;

import dao.filmdao.FilmDAO;
import dao.filmdao.impl.FilmDAOImpl;
import dao.ticketsdao.TicketsDAO;
import dao.ticketsdao.impl.TicketsDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import services.filmservice.FilmService;
import services.filmservice.impl.FilmServiceImpl;

import javax.sql.DataSource;

@Component
@Configuration
@ComponentScan(basePackages = "dao")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:file:C:\\MENTORINGAPP\\BookingTickets\\src\\db");
        dataSource.setUsername("admin");
        dataSource.setPassword("admin");
        return dataSource;
    }

    @Bean
    public TicketsDAO getTicketsDAO() {
        return new TicketsDAOImpl(getDataSource());
    }

    @Bean
    public FilmDAO getFilmDAO() {
        return new FilmDAOImpl(getDataSource());
    }

    @Bean
    public FilmService getFilmService() {
        return new FilmServiceImpl();
    }


}
