package guru.ysy.kotlinapp.services

import org.springframework.stereotype.Service

/**
 * @Author: Fred R. Zhen
 * @Date: 2023/7/6 11:52
 * @Email: fred.zhen@gmail.com
 */
@Service("ADIS")
class AnotherDIServiceImpl: DIService() {
    override fun getService(): String {
        return "Another Dependence Injection Implementation"
    }
}