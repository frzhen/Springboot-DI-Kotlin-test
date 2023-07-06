package guru.ysy.kotlinapp.services

import org.springframework.stereotype.Service

/**
 * @Author: Fred R. Zhen
 * @Date: 2023/7/6 10:13
 * @Email: fred.zhen@gmail.com
 */
@Service("DIS")
class DIServiceImpl : DIService() {
    override fun getService(): String {
        return "Hello, From Dependency Injection Service"
    }
}