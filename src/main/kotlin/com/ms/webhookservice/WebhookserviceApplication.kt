package com.ms.webhookservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebhookserviceApplication

fun main(args: Array<String>) {
	runApplication<WebhookserviceApplication>(*args)
}
