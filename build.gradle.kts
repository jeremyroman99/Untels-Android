buildscript {

  // The following section is needed only if pluginMangement is not used in settings.gradle 
  repositories {
    mavenCentral()
  }

  dependencies {
    classpath("com.newrelic.agent.android:agent-gradle-plugin:7.0.0")
  }
}