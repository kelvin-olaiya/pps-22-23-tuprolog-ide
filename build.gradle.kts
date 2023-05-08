plugins {
    java
}

tasks.create<JavaExec>("runIDE") {
    javaLauncher.set(javaToolchains.launcherFor {
        languageVersion.set(JavaLanguageVersion.of(8))
        vendor.set(JvmVendorSpec.ADOPTIUM)
    })
    classpath = files(File("2p-4.0.3.jar"))
    mainClass.set("alice.tuprologx.ide.GUILauncher") 
}
