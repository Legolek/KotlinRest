package pl.kotlin.rest.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pl.kotlin.rest.repository.UserRepository

/**
 * Created by Michal on 2016-07-04.
 */
@RestController
@RequestMapping("/users")
class UserController @Autowired constructor(val userRepository: UserRepository) {

    @RequestMapping("/all")
    fun getAll() = userRepository.findAll()

    @RequestMapping("/find")
    fun getByName(@RequestParam name: String) = userRepository.findByName(name)

}