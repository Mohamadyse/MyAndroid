package com.jailbreackers.soulhunter

import android.location.Location

class Coin {


    var image: Int? = null
    var description: String? = null
    var value: Double? = null
    var location: Location? = null

    var isCatch = false

    constructor(image: Int,
                description: String,
                value: Double = 10.0,
                lat: Double,
                long: Double) {

        this.image = image
        this.description = description
        this.value = value
        this.location = Location("coin")
        this.location!!.latitude = lat
        this.location!!.longitude = long


    }
    fun changeLocation  (location: Location,p:Double ){
        this.location!!.latitude =   location!!.latitude+p
        this.location!!.longitude = location!!.longitude+p

    }
    val p = Math.random()
    fun generateValue(){
        val p = Math.random()
        this.value = 10*p
    }

}