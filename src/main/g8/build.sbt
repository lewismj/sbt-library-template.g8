import Dependencies._
import Settings._

lazy val $library$ = (project in file("$library$")).
  settings(Settings.settings: _*).
  settings(Settings.$library$Settings: _*).
  configs(Test)

