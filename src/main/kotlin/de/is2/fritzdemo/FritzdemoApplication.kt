package de.is2.fritzdemo

import de.is2.fritzdemo.model.VersModel
import de.is2.fritzdemo.repositories.VersRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import java.util.*

@SpringBootApplication
class FritzdemoApplication {

	@Bean
	fun run(repository: VersRepository) = ApplicationRunner {
		repository.save(VersModel(
			aktiv = true,
			beitrag = 3.14,
			name = "Haftpflicht",
			typ =  "SUHK",
			versbegin = Calendar.getInstance().time,
			zahlungszyklus = 4
		))
		repository.save(VersModel(
			aktiv = false,
			beitrag = 6.28,
			name = "KZV",
			typ =  "SUHK",
			versbegin = Calendar.getInstance().time,
			zahlungszyklus = 1
		))
	}

}

fun main(args: Array<String>) {
	runApplication<FritzdemoApplication>(*args)
}