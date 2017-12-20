package learn.learn1;


import learn.Processor;
import learn.common.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@Import(Config.class)
public class Learn1Config {
    @Bean
    /**
     * The following processor will use jdbcTemplate to query the database and retrieve the number of rows in the LOG_DATA table.
     */
    Processor<String, Integer> processor(JdbcTemplate template) {
        return s -> template.queryForObject("Select count(*) from LOG_DATA", Integer.class);
    }
}
