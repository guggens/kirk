package app

import circle.konvaCircle
import kotlin.browser.document

import react.dom.*

fun main(args: Array<String>) {

    render(document.getElementById("reactcontainer")) {
        div {
            b {
                +"yeah, now with react"
            }
            konvaCircle()
        }
    }

}

