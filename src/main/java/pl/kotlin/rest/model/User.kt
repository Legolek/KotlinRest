package pl.kotlin.rest.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by Michal on 2016-07-04.
 */
@Entity
class User(
        var name: String = "",
        var age: Long = 0,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0)