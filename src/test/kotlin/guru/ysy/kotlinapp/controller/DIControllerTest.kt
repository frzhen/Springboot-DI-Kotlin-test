package guru.ysy.kotlinapp.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

/**
 * @Author: Fred R. Zhen
 * @Date: 2023/7/6 12:02
 * @Email: fred.zhen@gmail.com
 */
@SpringBootTest
class DIControllerTest {

    @Autowired
    lateinit var controller : DIController

    @Test
    fun sayHello() {
        println(controller.sayHello())
    }
}