package com.jcchikikomori.samples

/**
 * Read XML sample
 */
class ReadXML {

    static def assertion() {
        def todos = new XmlSlurper().parse('./src/main/resources/xml/sample.xml')
        assert 3 == todos.todo.size()
        assert "Buy Beginning Groovy Grails and Griffon" == todos.todo[0].name.text()
        assert "1" == todos.todo[0].@id.text()

        println '\nReadXML succeeded without errors'
    }

}
