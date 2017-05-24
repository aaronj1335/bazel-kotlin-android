load("@org_pubref_rules_kotlin//kotlin:rules.bzl", "kotlin_library", "kotlin_binary")

android_binary(
    name = "app",
    custom_package = "com.aaronstacy.app",
    manifest = "AndroidManifest.xml",
    resource_files = glob(["res/**"]),
    deps = [
       ":main_kt"

       # This works if I comment out the dep above and use this instead
       # ":java_main"
    ]
)

android_library(
    name = "java_main",
    srcs = glob(["MainActivity.java"]),
)

kotlin_library(
    name = "main",
    srcs = glob(["*.kt"]),
    deps = [
        "@bazel_tools//tools/android:sdk",
    ]
)
