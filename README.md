# Interaction for Action

## Build and run

This project uses [Gradle](http://www.gradle.org). As always `build.gradle` is used as main gradle file to manage this project. I use [Gradle ANTLR Plugin](https://docs.gradle.org/current/userguide/antlr_plugin.html) to generate grammar source. This deployment includes code generator, automatically executed by ``gradle build``. See also ``generateGrammarSource`` inside ``build.gradle``. `gradle run` will compile and execute all source code.

## Environment variables

**Optional - only in Linux - Bash**

See ``env.sh``. Only works in Bash environment. Just source it: ``source env.sh``. This file defines some environment variables:
* jf => go to the root directory of Jifa
* jt => go to the src/test/grammar
* t => test grammar (execute ``jt`` first), has to be in src/test/grammar dir
* d => delete all compilation results (execute ``jt`` first), has to be in src/test/grammar dir

Edit contents of ``jf`` and ``jt`` to suit your dir structure.

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
