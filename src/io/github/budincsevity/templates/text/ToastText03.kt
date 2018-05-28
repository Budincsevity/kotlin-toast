package io.github.budincsevity.templates.text

import io.github.budincsevity.templates.BaseToast

class ToastText03(bodyText: String, private val headlineText: String) : BaseToast(bodyText) {

    override fun toTemplate(appId: String): String {
        return """
        |@"
        |    <toast>
        |        <visual>
        |            <binding template="ToastText03">
        |               <text id="1">$headlineText</text>
        |               <text id="2">$bodyText</text>
        |            </binding>
        |        </visual>
        |    </toast>
        |"@
        """.trimMargin()
    }

}
