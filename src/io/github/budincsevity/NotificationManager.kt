package io.github.budincsevity

import io.github.budincsevity.templates.BaseToast
import java.io.File
import java.util.UUID

class NotificationManager {
    fun showToast(toast: BaseToast) {
        val fileName = UUID.randomUUID().toString()
        val tempFile = File.createTempFile(fileName, ".ps1")

        val psScript = getBaseScript(toast.toTemplate(APP_ID))
        tempFile.writeText(psScript)

        Runtime.getRuntime()
                .exec("""powershell.exe "${tempFile.absolutePath}"""")
                .waitFor()

        tempFile.delete()
    }

    companion object {
        private const val APP_ID = """'{1AC14E77-02E7-4E5D-B744-2EB1AE5198B7}\WindowsPowerShell\v1.0\powershell.exe'"""
        private fun getBaseScript(template: String): String =
                """|[Windows.UI.Notifications.ToastNotificationManager, Windows.UI.Notifications, ContentType = WindowsRuntime] | Out-Null
        |[Windows.UI.Notifications.ToastNotification, Windows.UI.Notifications, ContentType = WindowsRuntime] | Out-Null
        |[Windows.Data.Xml.Dom.XmlDocument, Windows.Data.Xml.Dom.XmlDocument, ContentType = WindowsRuntime] | Out-Null

        |${'$'}APP_ID = $APP_ID

        |${'$'}template = $template

        |${'$'}xml = New-Object Windows.Data.Xml.Dom.XmlDocument
        |${'$'}xml.LoadXml(${'$'}template)

        |${'$'}toast = New-Object Windows.UI.Notifications.ToastNotification ${'$'}xml
        |[Windows.UI.Notifications.ToastNotificationManager]::CreateToastNotifier(${'$'}APP_ID).Show(${'$'}toast)
        """.trimMargin()
    }
}
