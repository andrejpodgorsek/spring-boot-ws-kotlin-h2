package de.is2.fritzdemo.repositories

import de.is2.fritzdemo.model.VersModel
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel =  "versicherungen", path = "versicherungen")
interface VersRepository : CrudRepository <VersModel, Long> {

}
