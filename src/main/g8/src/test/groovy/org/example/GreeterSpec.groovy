package org.example

import spock.lang.Specification

class GreeterSpec extends Specification {

    def 'the greeting should say "Hello, World!"'() {
        expect:
        new Greeter().greeting == "Hello, World!"
    }
}
