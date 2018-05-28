package io.github.budincsevity.templates

abstract class BaseToast(val bodyText: String) {
    abstract fun toTemplate(appId: String): String
}
