package com.jcchikikomori.samples

import groovy.xml.MarkupBuilder

/**
 * Generate XML sample but in Groovy
 */
class GenerateXML {

    /**
     * getOutput is equivalent to 'output'
     */
    static String getOutput() {
        def writer = new StringWriter()
        def builder = new MarkupBuilder(writer)
        builder.doubleQuotes = true
        builder.todos {
            todo(id: '1') {
                name 'Buy Beginning Groovy Grails and Griffon'
                note 'Purchase book from Amazon.com for all co-workers.'
            }
        }
        return writer.toString()
    }

}
