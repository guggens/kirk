import konva.CircleConfig
import konva.Node
import konva.NodeConfig
import konva.StageConfig
import kotlinx.html.*
import react.RBuilder
import react.ReactElement
import react.dom.RDOMBuilder
import react.dom.tag


// see https://github.com/kotlin/kotlinx.html/wiki/Micro-templating-and-DSL-customizing

//class STAGE(consumer: TagConsumer<*>) :
//        HTMLTag("Stage", consumer, emptyMap(),
//                inlineTag = true,
//                emptyTag = false), HtmlInlineTag {
//}

//We know that it is applicable to <div> only so let's declare it

//fun DIV.stage(block: STAGE.() -> Unit = {}) {
//    STAGE(consumer).visit(block)
//}

fun RBuilder.stage(block: () -> Unit) = child(Stage::class) {
}

//inline fun RBuilder.stage(classes: String? = null, block: RDOMBuilder<STAGE>.() -> Unit): ReactElement = tag(block) { STAGE(it) }

// If you want it to be available on the root (like this: appendHTML().custom { }) you have to declare it on TagConsumer:

//fun <T> TagConsumer<T>.custom(block: CUSTOM.() -> Unit = {}): T {
//    return CUSTOM(this).visitAndFinalize(this, block)
//}