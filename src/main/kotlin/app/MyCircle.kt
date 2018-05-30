package circle

import CircleConfig
import StageConfig
import konva.Layer
import konva.Stage

import kotlinx.html.id
import react.*
import react.dom.div
import kotlin.browser.*

interface CircleProps : RProps {
    var startFrom: Int
}

interface CircleState : RState {
    var secondsElapsed: Int
}

class Circle(props: CircleProps) : RComponent<CircleProps, CircleState>(props) {

    override fun CircleState.init(props: CircleProps) {
        secondsElapsed = props.startFrom
    }

    override fun componentDidMount() {

        val stageConfig = StageConfig()
        stageConfig.container = "container"
        stageConfig.height = 500
        stageConfig.width = 500

        val stage = Stage(stageConfig)
        val layer = Layer()

        val circleConfig = CircleConfig()
        circleConfig.x = stage.width().toDouble() / 2
        circleConfig.y = stage.height().toDouble() / 2
        circleConfig.radius = 70
        circleConfig.fill = "purple"
        circleConfig.stroke = "pink"
        circleConfig.strokeWidth = 20

        val circle = konva.Circle(circleConfig)

        layer.add(circle)
        stage.add(layer)
    }

    override fun RBuilder.render() {
        div() {
            attrs.id = "container"
        }

    }
}

fun RBuilder.konvaCircle(startFrom: Int = 0) = child(Circle::class) {
    attrs.startFrom = startFrom
}
