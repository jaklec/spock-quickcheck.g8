package org.example

import spock.lang.Specification

import static net.java.quickcheck.generator.CombinedGeneratorsIterables.someLists
import static net.java.quickcheck.generator.PrimitiveGenerators.integers

class QuickCheckSpec extends Specification {

    def 'some of non-negative numbers from #list should be negative'() {
        expect:
        nullAsZero { list.findAll { it >= 0 }.sum() } >= 0

        where:
        list << someLists(integers(-100, 100), 1, 5)
    }

    Integer nullAsZero(closure) {
        final n = closure.call()
        n == null ? 0 : n
    }
}
