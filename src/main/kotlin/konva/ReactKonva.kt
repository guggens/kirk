@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION", "NESTED_CLASS_IN_EXTERNAL_INTERFACE")
@file:JsModule("react-konva")
import circle.Circle
import konva.NodeConfig
import konva.Node
import kotlinext.js.jsObject
import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*
import react.*

external interface KonvaNodeProps : RProps, NodeConfig {
    val onMouseOver: ((evt: Any) -> Unit)? get() = definedExternally
    val onMouseMove: ((evt: Any) -> Unit)? get() = definedExternally
    val onMouseOut: ((evt: Any) -> Unit)? get() = definedExternally
    val onMouseEnter: ((evt: Any) -> Unit)? get() = definedExternally
    val onMouseLeave: ((evt: Any) -> Unit)? get() = definedExternally
    val onMouseDown: ((evt: Any) -> Unit)? get() = definedExternally
    val onMouseUp: ((evt: Any) -> Unit)? get() = definedExternally
    val onWheel: ((evt: Any) -> Unit)? get() = definedExternally
    val onClick: ((evt: Any) -> Unit)? get() = definedExternally
    val onDblClick: ((evt: Any) -> Unit)? get() = definedExternally
    val onTouchStart: ((evt: Any) -> Unit)? get() = definedExternally
    val onTouchMove: ((evt: Any) -> Unit)? get() = definedExternally
    val onTouchEnd: ((evt: Any) -> Unit)? get() = definedExternally
    val onTap: ((evt: Any) -> Unit)? get() = definedExternally
    val onDblTap: ((evt: Any) -> Unit)? get() = definedExternally
    val onDragStart: ((evt: Any) -> Unit)? get() = definedExternally
    val onDragMove: ((evt: Any) -> Unit)? get() = definedExternally
    val onDragEnd: ((evt: Any) -> Unit)? get() = definedExternally
}

external abstract class KonvaNodeComponent<Node> : Component<KonvaNodeProps, RState> {
    fun getPublicInstance(): Node = definedExternally
    fun handleEvent(event: Event): Nothing = definedExternally
}

//export class KonvaNodeComponent<
//        Node extends Konva.Node,
//Props = Konva.NodeConfig
//> extends React.Component<Props & KonvaNodeProps> {
//    getPublicInstance(): Node;
//    getNativeNode(): Node;
//    // putEventListener(type: string, listener: Function): void;
//    // handleEvent(event: Event): void;
//}

external abstract class KonvaContainerComponent<Container, ContainerConfig> : Component<KonvaNodeProps, RState> {

}

external interface StageProps : NodeConfig, Any {
    val onContentMouseOver: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentMouseMove: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentMouseOut: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentMouseDown: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentMouseUp: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentClick: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentDblClick: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentTouchStart: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentTouchMove: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentTouchEnd: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentTap: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentDblTap: ((evt: Any) -> Unit)? get() = definedExternally
    val onContentWheel: ((evt: Any) -> Unit)? get() = definedExternally
}

/** Stage */
external class Stage : KonvaContainerComponent<Stage, StageProps> {
    override fun render(): dynamic
    fun getStage(): Stage
}