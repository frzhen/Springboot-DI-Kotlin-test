package guru.ysy.kotlinapp

import guru.ysy.kotlinapp.controller.AnotherDIController
import guru.ysy.kotlinapp.controller.DIController
import guru.ysy.kotlinapp.services.*
import guru.ysy.kotlinapp.services.DIServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
@SpringBootApplication
class KotlinAppApplication

fun main(args: Array<String>) {
    runApplication<KotlinAppApplication>(*args)
    val diService = DIServiceImpl()
    val controller = DIController(diService)
    val adiService = AnotherDIServiceImpl()
    val anotherController = AnotherDIController(adiService)
    println("In main method")
    println(controller.sayHello())
    println(anotherController.sayHello())
}