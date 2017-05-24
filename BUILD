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
    java_deps = [
        ":androidsdk"

        # blaze-bin/resources_resources.jar has the R.* classes this target
        # needs to compile, but it's not exposed.
        ":resources_resources.jar",
    ],
)

java_import(
    name = "androidsdk",
    neverlink = 1,
    jars = [
        "//tools/defaults:android_jar",
    ]
)

android_library(
    name = "resources",
    resource_files = glob(["res/**"]),
        manifest = "AndroidManifest.xml",
    custom_package = "com.aaronstacy.app",
)
