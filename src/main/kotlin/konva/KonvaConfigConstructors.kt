import konva.CircleConfig
import konva.StageConfig
import kotlinext.js.jsObject
import kotlinx.html.*

// easyest way to create instances of external interfaces - found here:
// https://kotlinlang.org/docs/reference/js-interop.html

fun StageConfig(): StageConfig = jsObject{}

fun CircleConfig(): CircleConfig = jsObject{}

fun KonvaNodeProps(): KonvaNodeProps = jsObject{}