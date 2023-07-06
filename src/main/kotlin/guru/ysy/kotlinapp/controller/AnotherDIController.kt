package guru.ysy.kotlinapp.controller

import guru.ysy.kotlinapp.services.DIService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

/**
 * @Author: Fred R. Zhen
 * @Date: 2023/7/6 11:55
 * @Email: fred.zhen@gmail.com
 */
@Controller
class AnotherDIController(@Qualifier("ADIS") val adiService: DIService) {

    fun sayHello(): String {
        return adiService.getService()
    }
}