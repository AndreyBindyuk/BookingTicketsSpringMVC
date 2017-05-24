package configuration;

import dao.filmdao.FilmDAO;
import dao.filmdao.impl.FilmDAOImpl;
import dao.ticketsdao.TicketsDAO;
import dao.ticketsdao.impl.TicketsDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import services.filmservice.FilmService;
import services.filmservice.impl.FilmServiceImpl;
import services.ticketsservice.TicketsService;
import services.ticketsservice.impl.TicketsServiceImpl;

@Component
@Configuration
@ComponentScan(basePackages = "dao")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

    @Bean
    public TicketsDAO getTicketsDAO() {
        return new TicketsDAOImpl();
    }

    @Bean
    public FilmDAO getFilmDAO() {
        return new FilmDAOImpl();
    }

    @Bean
    public FilmService getFilmService() {
        return new FilmServiceImpl();
    }

    @Bean
    public TicketsService getTicketsService() {
        return new TicketsServiceImpl();
    }


}
