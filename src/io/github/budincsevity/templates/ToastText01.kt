package io.github.budincsevity.templates

class ToastText01(bodyText: String) : BaseToast(bodyText) {
    override fun toTemplate(appId: String): String {
        return """
        |@"
        |    <toast>
        |        <visual>
        |            <binding template="ToastText01">
        |               <text id="1">$bodyText</text>
        |            </binding>
        |        </visual>
        |    </toast>
        |"@
        """.trimMargin()
    }
}
