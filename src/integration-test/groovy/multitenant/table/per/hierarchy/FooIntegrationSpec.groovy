package multitenant.table.per.hierarchy

import grails.gorm.multitenancy.Tenants
import grails.testing.mixin.integration.Integration
import grails.transaction.Rollback
import spock.lang.Specification

@Integration
@Rollback
class FooIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test Foo.first()"() {
        when:
        new Foo(name: 'foo1').save flush:true, failOnError: true

        then:"we find the only foo in the database"
        Foo.first().name == 'foo1'
    }

    void "test find Foo"() {
        when:
        new Foo(name: 'foo1').save flush:true, failOnError: true

        then:"we find the only foo in the database"
        Foo.find{ name == 'foo1' }.name == 'foo1'
    }

    void "test find using Tenants.withoutId closure"() {
        when:
        new Foo(name: 'foo1').save flush:true, failOnError: true

        then:"we find the only foo in the database"
        Tenants.withoutId {
            Foo.find{ name == 'foo1' }.name == 'foo1'
        }
    }

    void "test BaseFoo.first()"() {
        when:
        new BaseFoo().save flush:true, failOnError: true

        then:"we find the only baseFoo in the database"
        BaseFoo.first().bar == 'bar'
    }

    void "test find BaseFoo"() {
        when:
        new BaseFoo().save flush:true, failOnError: true

        then:"we find the only baseFoo in the database"
        BaseFoo.find{ bar == 'bar'}.bar == 'bar'
    }
}
