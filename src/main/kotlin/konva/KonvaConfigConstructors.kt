import konva.CircleConfig
import konva.StageConfig
import kotlinx.html.*

// easyest way to create instances of external interfaces - found here:
// https://kotlinlang.org/docs/reference/js-interop.html

fun StageConfig(): StageConfig = js("{}")

fun CircleConfig(): CircleConfig = js("{}")
