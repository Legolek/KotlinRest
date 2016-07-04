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

    private val INVALID_PARAM = "Invalid paramater"

    @RequestMapping("/month")
    fun mapMonth(@RequestParam nbr: Int): ResponseDto {
        var strMonth = when (nbr) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            else -> INVALID_PARAM
        }
        if (INVALID_PARAM === strMonth) {
            return ResponseDto(false, INVALID_PARAM)
        } else {
            return ResponseDto(true, "Converted month is $strMonth")
        }
    }

}