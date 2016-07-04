package pl.kotlin.rest

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement
import pl.kotlin.rest.model.User
import pl.kotlin.rest.repository.UserRepository

/**
 * Created by Michal on 2016-07-04.
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
open class Application {
    @Bean
    open fun generateUsers(userRepository: UserRepository) = CommandLineRunner {
        userRepository.save(User("Zbych", 45))
        userRepository.save(User("Stach", 44))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}