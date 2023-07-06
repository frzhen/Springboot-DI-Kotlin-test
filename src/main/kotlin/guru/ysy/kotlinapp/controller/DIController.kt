package guru.ysy.kotlinapp.controller

import guru.ysy.kotlinapp.services.DIService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

/**
 * @Author: Fred R. Zhen
 * @Date: 2023/7/6 10:11
 * @Email: fred.zhen@gmail.com
 */
@Controller
class DIController(@Qualifier("DIS") val diService: DIService) {
    fun sayHello(): String{
        return diService.getService()
    }
}