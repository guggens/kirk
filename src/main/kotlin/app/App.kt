package app

import circle.konvaCircle
import kotlin.browser.document

import react.dom.*
import stage

fun main(args: Array<String>) {

    kotlinext.js.require("react-konva")

    render(document.getElementById("reactcontainer")) {
        div {
            b {
                +"yeah, now with react"
            }
            konvaCircle()
            stage {

            }
        }
    }

}

