package com.ms.webhookservice.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/"])
class WelcomeController {

    @Value("\${app.message}")
    private val welcomeMessage: String? = "Welcome unable to load envoirment variables"

    @Value("\${server.port}")
    var server_port: String? = null

    @GetMapping("")
    fun index(): String? {
        return welcomeMessage + " running port " + server_port
    }

    @GetMapping("/info")
    fun serviceInfo(): String? {
        return "This is Call Back Service"
    }
}