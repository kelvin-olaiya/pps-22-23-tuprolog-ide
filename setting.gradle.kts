plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.9.0")
}

toolchainManagement {
    jvm { 
        javaRepositories {
            repository("foojay") { 
                resolverClass.set(org.gradle.toolchains.foojay.FoojayToolchainResolver::class.java)
            }
        }
    }
}
