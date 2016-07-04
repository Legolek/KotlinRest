package pl.kotlin.rest.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Created by Michal on 2016-07-04.
 */
@RestController
class TestController {

    @RequestMapping("/")
    fun getResponse() = ResponseDto(true, "Test message")

    @RequestMapping("/month")
    fun mapMonth(@RequestParam nbr: Int) = when(nbr) {
        1 -> ResponseDto(true, "January")
        2 -> ResponseDto(true, "February")
        else -> ResponseDto(false, "Invalid paramater")
    }
}