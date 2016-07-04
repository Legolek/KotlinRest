package pl.kotlin.rest.repository

import org.springframework.data.repository.CrudRepository
import pl.kotlin.rest.model.User

/**
 * Created by Michal on 2016-07-04.
 */
interface UserRepository : CrudRepository<User, Long> {
    fun findByName(name: String): List<User>
}