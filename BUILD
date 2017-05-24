load("@org_pubref_rules_kotlin//kotlin:rules.bzl", "kotlin_library", "kotlin_binary")

android_binary(
    name = "app",
    custom_package = "com.aaronstacy.app",
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [
       ":main_kt"
    ]
)

kotlin_library(
    name = "main",
    srcs = glob(["*.kt"]),
    java_deps = [
        ":androidsdk"
    ]
)

java_import(
    name = "androidsdk",
    neverlink = 1,
    jars = [
        "//tools/defaults:android_jar",
    ]
)
