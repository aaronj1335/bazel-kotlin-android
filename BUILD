load("@org_pubref_rules_kotlin//kotlin:rules.bzl", "kotlin_library", "kotlin_binary")

android_binary(
    name = "app",
    multidex = "native",
    dex_shards = 10,
            manifest = "AndroidManifest.xml",
        custom_package = "com.aaronstacy.app",

    deps = [
        ":resources",
       ":main_kt",
    ]
)

kotlin_library(
    name = "main",
    srcs = glob(["*.kt"]),
#    jars = []
    java_deps = [
        ":androidsdk"
#        ":libresources.jar",
#        ":resources",
        ":resources_import",
    ],
)

java_import(
    name = "androidsdk",
    neverlink = 1,
    jars = [
        "//tools/defaults:android_jar",
    ]
)

java_import(
    name = "resources_import",
    jars = [
        ":resources_resources.jar",
    ],
)

android_library(
    name = "resources",
    resource_files = glob(["res/**"]),
        manifest = "AndroidManifest.xml",
    custom_package = "com.aaronstacy.app",
)
