package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class B(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("b", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BASE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("base", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var href : String by attributeStringf30f39f0
    var target : String by attributeStringf30f39f0

}

public class BDI(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("bdi", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BDO(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("bdo", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BLOCKQUOTE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("blockquote", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var cite : String by attributeStringf30f39f0

}

public class BODY(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("body", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {
    var onResize : String by attributeStringOnResize80ecc161
    var onPopstate : String by attributeStringOnPopstatebc4fd5cd
    var onBeforeprint : String by attributeStringOnBeforeprint6be0655d
    var onHashChange : String by attributeStringOnHashChange85a50f6b
    var onBeforeunLoad : String by attributeStringOnBeforeunLoad9cb4b4ab
    var onUndo : String by attributeStringOnUndob6be1951
    var onOffline : String by attributeStringOnOffline832eb132
    var onUnLoad : String by attributeStringOnUnLoad868703ac
    var onStorage : String by attributeStringOnStorage6f2ce5ca
    var onRedo : String by attributeStringOnRedob6bc9a6b
    var onMessage : String by attributeStringOnMessage1867a356
    var onAfterprint : String by attributeStringOnAfterprinta038b37e
    var onOnline : String by attributeStringOnOnline7c49db00

}

public class BR(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("br", consumer, initialAttributes), CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade {

}

public class BUTTON(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("button", consumer, initialAttributes), AServerAttributeGroupFacade, CommonEventsGroupFacade, CoreAttributeGroupFacade, CoreServerAttributeGroupFacade, ButtonServerAttributeGroupFacade {
    var formMethod : FormMethod by attributeFormMethodFormMethodFormMethodValues7a953fbe
    var formNovalidate : Boolean by attributeBooleanFormNovalidateFormNovalidateEmpty2caba9f7
    var autoFocus : Boolean by attributeBooleanAutoFocusAutoFocusEmptya5698437
    var value : String by attributeStringf30f39f0
    var formEncType : FormEncType by attributeFormEncTypeFormEncTypeFormEncTypeValues5f514f53
    var formAction : String by attributeStringFormAction57b2208
    var form : String by attributeStringf30f39f0
    var name : String by attributeStringf30f39f0
    var formTarget : String by attributeStringFormTarget25ca1563
    var type : String by attributeStringf30f39f0
    var disabled : Boolean by attributeBooleanDisabledDisabledEmptyf8f91d7

}

