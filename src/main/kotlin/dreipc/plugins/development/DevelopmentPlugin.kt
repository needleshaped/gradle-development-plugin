package dreipc.plugins.development

import dreipc.plugins.development.modul.*
import org.gradle.api.Plugin
import org.gradle.api.Project


class DevelopmentPlugin : Plugin<Project> {

    override fun apply(target: Project) {
        target.plugins.apply(Java::class.java)
        target.plugins.apply(SemanticVersioning::class.java)
        target.plugins.apply(Lombok::class.java)
        target.plugins.apply(Testing::class.java)
        target.plugins.apply(CodeQuality::class.java)
        target.plugins.apply(GradlePropertyExpansion::class.java)


        if (target.plugins.hasPlugin("org.springframework.boot")) {
            target.plugins.apply(Docker::class.java)
        }

    }
}