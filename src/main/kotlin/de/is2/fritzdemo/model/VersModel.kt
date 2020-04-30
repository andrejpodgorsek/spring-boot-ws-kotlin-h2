package de.is2.fritzdemo.model

import java.time.LocalDate
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class VersModel(
        @Id
        @GeneratedValue
        var id: Long = -1,
        var name: String = "",
        var typ: String = "",
        var beitrag: Double = 0.0,
        var zahlungszyklus: Int = 1,
        var versbegin: Date ?= null,
        var aktiv: Boolean = false
) {}
