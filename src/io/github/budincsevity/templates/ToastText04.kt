package io.github.budincsevity.templates

class ToastText04(bodyText: String,
                  private val bodyText2: String,
                  private val headlineText: String) : BaseToast(bodyText) {
    override fun toTemplate(appId: String): String {
        return """
        |@"
        |    <toast>
        |        <visual>
        |            <binding template="ToastText04">
        |               <text id="1">$headlineText</text>
        |               <text id="2">$bodyText</text>
        |               <text id="3">$bodyText2</text>
        |            </binding>
        |        </visual>
        |    </toast>
        |"@
        """.trimMargin()
    }
}
