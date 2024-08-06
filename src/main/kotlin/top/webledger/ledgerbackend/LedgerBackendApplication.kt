package top.webledger.ledgerbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LedgerBackendApplication

fun main(args: Array<String>) {
    runApplication<LedgerBackendApplication>(*args)
}
