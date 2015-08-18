# Interaction for Action

## Build

This project uses [Gradle](http://www.gradle.org). As always `build.gradle` is used as main gradle file to manage this project. I use [Gradle ANTLR Plugin](https://docs.gradle.org/current/userguide/antlr_plugin.html) to generate grammar source. Note that initially I use [Tiny Language](https://github.com/bkiers/tiny-language-antlr4) and extend it for dissertation purposes. Since this deployment includes code generator, some steps are needed.

* `gradle build`, this will generate some source code, build, and compile them. Generated sources exist in `build/generated-src/antlr/main/`. Actually Gradle ANTLR plugin can accept `outputDirectory`, but I prefer default location so that they don't mixed up with others.
* Copy all files in generated sources directory above to `src/main/java/name.bpdp.weberia.jifa.generated`. I use Intellij IDEA, so, the package name are automatically appended. If you use [vim](http://www.vim.org) or any other text editor, chances are you need to append package name manually.
* `gradle run` will compile and execute all source code. If there is no error, it will print `All Assertions have passed`. 

## License

~~~
Copyright 2015, Bambang Purnomosidi D. P.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
~~~

## Author

The author ([Bambang Purnomosidi D. P.](http://bpdp.name)) is Ph.D candidate in [Electrical Engineering and Information Technology](http://pasca.te.ugm.ac.id), [Faculty of Engineering](http://www.fakultas-teknik.ugm.ac.id), [Gadjah Mada University](http://www.ugm.ac.id). He can be contacted by:
* Email: bambangpdp-with-domain-name-yahoocom-or-gmailcom
* Facebook: [/bambangpdp](http://www.facebook.com/bambangpdp)
* Twitter: [@bpdp](http://twitter.com/bpdp)
