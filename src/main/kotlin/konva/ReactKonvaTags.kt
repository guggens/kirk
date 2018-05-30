import konva.CircleConfig
import konva.StageConfig
import kotlinx.html.*


// see https://github.com/kotlin/kotlinx.html/wiki/Micro-templating-and-DSL-customizing

class STAGE(consumer: TagConsumer<*>) :
        HTMLTag("stage", consumer, emptyMap(),
                inlineTag = true,
                emptyTag = false), HtmlInlineTag {
}

//We know that it is applicable to <div> only so let's declare it

fun DIV.stage(block: STAGE.() -> Unit = {}) {
    STAGE(consumer).visit(block)
}


// If you want it to be available on the root (like this: appendHTML().custom { }) you have to declare it on TagConsumer:

//fun <T> TagConsumer<T>.custom(block: CUSTOM.() -> Unit = {}): T {
//    return CUSTOM(this).visitAndFinalize(this, block)
//}