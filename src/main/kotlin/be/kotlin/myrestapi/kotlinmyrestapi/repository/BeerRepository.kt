package be.kotlin.myrestapi.kotlinmyrestapi.repository

import be.kotlin.myrestapi.kotlinmyrestapi.entity.BeerEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BeerRepository : JpaRepository<BeerEntity, Long>{

    fun findByBeerName(beerName: String):Iterable<BeerEntity>

    fun findByAlcoholPercentage(percentage: Double):Iterable<BeerEntity>

    fun findByBeerTypeId(beerTypeId: Long): Iterable<BeerEntity>
}