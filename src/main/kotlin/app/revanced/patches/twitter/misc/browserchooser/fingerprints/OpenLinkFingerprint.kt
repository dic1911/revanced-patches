package app.revanced.patches.twitter.misc.browserchooser.fingerprints

import app.revanced.patcher.fingerprint.MethodFingerprint


internal object OpenLinkFingerprint : MethodFingerprint(
    returnType = "V",
    parameters = listOf("Landroid/content/Context;", "Landroid/content/Intent;", "Landroid/os/Bundle;")
)
