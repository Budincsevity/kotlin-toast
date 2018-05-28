package io.github.budincsevity.templates.factory

import io.github.budincsevity.templates.BaseToast
import io.github.budincsevity.templates.ToastType
import io.github.budincsevity.templates.text.ToastText01
import io.github.budincsevity.templates.text.ToastText02
import io.github.budincsevity.templates.text.ToastText03
import io.github.budincsevity.templates.text.ToastText04

object ToastFactory {

    fun getInstance(toastType: ToastType, headlineText: String = "", bodyText: String = "", bodyText2: String = ""): BaseToast {
        return when (toastType) {
            ToastType.TOAST_TEXT_1 -> ToastText01(bodyText = bodyText)
            ToastType.TOAST_TEXT_2 -> ToastText02(bodyText = bodyText, headlineText = headlineText)
            ToastType.TOAST_TEXT_3 -> ToastText03(bodyText = bodyText, headlineText = headlineText)
            ToastType.TOAST_TEXT_4 -> ToastText04(bodyText = bodyText, bodyText2 = bodyText2, headlineText = headlineText)
        }
    }

}
