# Kotlin Toast
With Kotlin Toast library you can create and show Windows Toast notifications from you Kotlin applications.

## Usage

#### Using ToastFactory (recommended)

```
val headlineText = "Everything is awesome"
val bodyText = "Everything is awesome when we're living our dream"

val toast = ToastFactory().getInstance(ToastType.TOAST_TEXT_2, headlineText, bodyText)
NotificationManager().showToast(toast)
```

#### Instantiating Toast directly

```
val headlineText = "Everything is awesome"
val bodyText = "Everything is awesome when we're living our dream"

NotificationManager().showToast(ToastText02(bodyText, headlineText))
```

Package hierarchy and supported toast types may change with the next releases. To avoid build failures after a new update, please use the ToastFactory class.

## Supported Toast types

Toast template catalog and detailed descriptions are available on [Microsoft Docs](https://docs.microsoft.com/en-us/previous-versions/windows/apps/hh761494(v=win.10)).

#### ToastText01
![ToastText01](https://docs.microsoft.com/en-us/previous-versions/windows/apps/images/hh761494.toast_1%28en-us%2cwin.10%29.png "ToastText01")
#### ToastText02
![ToastText02](https://docs.microsoft.com/en-us/previous-versions/windows/apps/images/hh761494.toast_2%28en-us%2cwin.10%29.png "ToastText02")
#### ToastText03
![ToastText03](https://docs.microsoft.com/en-us/previous-versions/windows/apps/images/hh761494.toast_4%28en-us%2cwin.10%29.png "ToastText03")
#### ToastText04
![ToastText04](https://docs.microsoft.com/en-us/previous-versions/windows/apps/images/hh761494.toast_5%28en-us%2cwin.10%29.png "ToastText04")

Support for toast notifications with hero images and audio is in progress.
