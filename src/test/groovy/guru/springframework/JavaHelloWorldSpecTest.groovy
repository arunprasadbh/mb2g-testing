package guru.springframework

import spock.lang.Specification

class JavaHelloWorldSpecTest extends Specification {
    def "GetHello"() {
        //println("Running Spec Tests!");
        when:
        def foo = "123"
        then:
        true
    }
}
