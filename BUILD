load("@org_pubref_rules_kotlin//kotlin:rules.bzl", "kotlin_library", "kotlin_binary")

PACKAGE = "com.aaronstacy.app"
MANIFEST = "AndroidManifest.xml"
MANIFEST_VALUES = {"PACKAGE": PACKAGE}

android_binary(
    name = "app",
    custom_package = PACKAGE,
    manifest = MANIFEST,
    manifest_values = MANIFEST_VALUES,
    deps = [
       ":main_kt",
       ":resources",
    ],
)

kotlin_library(
    name = "main",
    srcs = glob(["*.kt"]),
    java_deps = [
        ":androidsdk",
    ],
    android_deps = [
        ":resources",
    ],
)

java_import(
    name = "androidsdk",
    neverlink = 1,
    jars = [
        "//tools/defaults:android_jar",
    ],
)

android_library(
    name = "resources",
    custom_package = PACKAGE,
    manifest = MANIFEST,
    resource_files = glob(["res/**"]),
)
