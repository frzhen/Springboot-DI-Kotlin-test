package guru.ysy.kotlinapp.controller

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.stereotype.Controller

/**
 * @Author: Fred R. Zhen
 * @Date: 2023/7/6 15:11
 * @Email: fred.zhen@gmail.com
 */
@SpringBootTest
class AnotherDIControllerTest {

    @Autowired
    lateinit var controller: AnotherDIController

    @Test
    fun sayHello() {
        println(controller.sayHello())
    }
}